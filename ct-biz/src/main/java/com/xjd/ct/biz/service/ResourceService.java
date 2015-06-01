package com.xjd.ct.biz.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

import com.xjd.ct.biz.bo.ResourceBo;
import com.xjd.ct.dal.dao.ResourceDao;
import com.xjd.ct.dal.dos.ObjectResourceDo;
import com.xjd.ct.dal.dos.ResourceDo;
import com.xjd.ct.dal.dos.UserResourceDo;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.DigestUtil;
import com.xjd.ct.utl.constant.AppConstant;
import com.xjd.ct.utl.context.AppContext;
import com.xjd.ct.utl.enums.ResFormEnum;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

/**
 * <pre>
 * 资源服务
 * 
 * 资源上传、下载、处理等
 * </pre>
 * 
 * @author elvis.xu
 * @since 2015-4-30 下午6:01:27
 */
@Service
public class ResourceService {
	@Autowired
	ResourceDao resourceDao;

	public List<ResourceBo> listResource(Byte entityType, Long entityId) {
		List<ObjectResourceDo> objectResourceDoList = resourceDao.selectObjectResourceByEntityTypeAndEntityId(
				entityType, entityId);

		List<ResourceBo> resourceBoList = new ArrayList<ResourceBo>(objectResourceDoList.size());
		for (ObjectResourceDo objectResourceDo : objectResourceDoList) {
			ResourceDo resourceDo = resourceDao.selectResourceByResId(objectResourceDo.getResId());

			// 直接生成URL让前端加载
			resourceDo.setResForm(ResFormEnum.LINK.getCode());
			resourceDo.setResPath(AppContext.getProperty(AppContext.KEY_RESOURCE_URL_PREFIX) + resourceDo.getResPath());

			ResourceBo resourceBo = new ResourceBo();
			BeanUtils.copyProperties(resourceDo, resourceBo);
			BeanUtils.copyProperties(objectResourceDo, resourceBo);
			resourceBoList.add(resourceBo);
		}
		return resourceBoList;
	}

	public ResourceBo upload(Long userId, File file, String format, String contentType) {
		String md5 = DigestUtil.md5(file);

		if (format != null) {
			format = format.toLowerCase();
		}

		ResourceDo resourceDo = resourceDao.selectResourceByMd5AndFormat(md5, format);
		if (resourceDo == null) {
			resourceDo = new ResourceDo();
			resourceDo.setResId(generateResourceId());
			resourceDo.setContentType(contentType);
			resourceDo.setResFormat(format);
			resourceDo.setResForm(ResFormEnum.FILE.getCode());
			resourceDo.setResPath(generateResourcePath(resourceDo.getResId(), md5, format));
			resourceDo.setResMd5(md5);
			resourceDo.setResLength(file.length());
			Long now = DateUtil.nowInMilliseconds();
			resourceDo.setAddTime(now);
			resourceDo.setUpdTime(now);

			saveResourceFile(file, resourceDo.getResPath());
			resourceDao.insertResource(resourceDo);
		}

		UserResourceDo userResourceDo = resourceDao.selectUserResourceByUserIdAndResId(userId, resourceDo.getResId());
		if (userResourceDo == null) {
			userResourceDo = new UserResourceDo();
			userResourceDo.setUserId(userId);
			userResourceDo.setResId(resourceDo.getResId());
			userResourceDo.setAddTime(DateUtil.nowInMilliseconds());
			resourceDao.insertUserResource(userResourceDo);
		}

		ResourceBo resourceBo = new ResourceBo();
		BeanUtils.copyProperties(resourceDo, resourceBo);

		return resourceBo;
	}

	protected String generateResourceId() {
		return UUID.randomUUID().toString().toUpperCase().replace("-", "");
	}

	protected String generateResourcePath(String resId, String md5, String format) {
		String suffix = ".no";
		if (StringUtils.isNotBlank(format)) {
			suffix = "." + format;
		}

		String prefix = DateUtil.format(DateUtil.now(), DateUtil.PATTERN_YEAR2SECOND);

		return prefix + "_" + resId + "_" + md5 + suffix;
	}

	protected void saveResourceFile(File file, String resPath) {
		String resRoot = AppContext.getProperty(AppConstant.RESOURCE_ROOT_PATH_KEY);
		File resFile = new File(resRoot, resPath);

		File pFile = resFile.getParentFile();
		if (!pFile.isDirectory()) {
			pFile.mkdirs();
		}

		file.renameTo(resFile);
	}

	public ResourceBo queryResource(String resId) {
		ResourceDo resourceDo = resourceDao.selectResourceByResId(resId);
		ResourceBo resourceBo = new ResourceBo();
		BeanUtils.copyProperties(resourceDo, resourceBo);
		return resourceBo;
	}

	public void download(String resId, OutputStream out) {
		ResourceDo resourceDo = resourceDao.selectResourceByResId(resId);
		if (resourceDo == null) {
			throw new BusinessException(RespCode.RESP_0221);
		}

		ResFormEnum resFormEnum = ResFormEnum.valueOfCode(resourceDo.getResForm());
		if (resFormEnum == ResFormEnum.FILE) {
			File resFile = new File(AppContext.getProperty(AppConstant.RESOURCE_ROOT_PATH_KEY), resourceDo.getResPath());
			FileInputStream in = null;
			try {
				in = new FileInputStream(resFile);
				StreamUtils.copy(in, out);
			} catch (IOException e) {
				throw new RuntimeException(e);
			} finally {
				if (in != null) {
					try {
						in.close();
					} catch (IOException e) {
						// DO NOTHING
					}
				}
			}
		} else if (resFormEnum == ResFormEnum.LINK) {
			// FIXME
		}
	}
}
