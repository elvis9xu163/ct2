package com.xjd.ct.biz.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.biz.bo.ObjectBo;
import com.xjd.ct.dal.dao.ObjectDao;
import com.xjd.ct.dal.dao.ResourceDao;
import com.xjd.ct.dal.dao.SequenceDao;
import com.xjd.ct.dal.dos.ObjectDo;
import com.xjd.ct.dal.dos.ObjectResourceDo;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.enums.BoolEnum;
import com.xjd.ct.utl.enums.EntityTypeEnum;
import com.xjd.ct.utl.enums.ObjectContentTypeEnum;
import com.xjd.ct.utl.enums.ObjectTypeEnum;

/**
 * <pre>
 * 业务对象更新服务
 * 
 * 文章、话题、UGC等的添加和编辑
 * </pre>
 * 
 * @author elvis.xu
 * @since 2015-4-30 下午6:10:56
 */
@Service
public class ObjectUpdateService {
	@Autowired
	SequenceDao sequenceDao;
	@Autowired
	ObjectDao objectDao;
	@Autowired
	ResourceDao resourceDao;
	@Autowired
	ResourceService resourceService;

	@Transactional
	public ObjectBo addPublish(Long userId, String title, String content, String resources) {
		ObjectDo objectDo = new ObjectDo();
		objectDo.setObjectId(generateObjectId());
		objectDo.setUserId(userId);
		objectDo.setObjectType(ObjectTypeEnum.PUBLISH.getCode());
		objectDo.setTitle(title);
		objectDo.setSummary(null);
		objectDo.setContentType(ObjectContentTypeEnum.TEXT.getCode());
		objectDo.setContent(content);
		objectDo.setVoteFlag(BoolEnum.FALSE.getCode());
		objectDo.setVoteMultiFlag(BoolEnum.FALSE.getCode());
		objectDo.setLikeYesFlag(BoolEnum.TRUE.getCode());
		objectDo.setLikeYesCount(0);
		objectDo.setLikeNoFlag(BoolEnum.FALSE.getCode());
		objectDo.setLikeNoCount(0);
		objectDo.setCommentFlag(BoolEnum.TRUE.getCode());
		objectDo.setCommentCount(0);
		objectDo.setFavorFlag(BoolEnum.TRUE.getCode());
		objectDo.setFavorCount(0);
		Long now = DateUtil.nowInMilliseconds();
		objectDo.setAddTime(now);
		objectDo.setUpdTime(now);

		List<ObjectResourceDo> objectResourceDoList = new ArrayList<ObjectResourceDo>();
		if (StringUtils.isNotBlank(resources)) {
			String[] resourceArray = resources.split(";");
			for (String resource : resourceArray) {
				resource = StringUtils.trim(resource);
				if (StringUtils.isEmpty(resource)) {
					continue;
				}
				String[] parts = resource.split(":");
				ObjectResourceDo objectResourceDo = new ObjectResourceDo();
				objectResourceDo.setResId(parts[0]);
				objectResourceDo.setEntityType(EntityTypeEnum.OBJECT.getCode());
				objectResourceDo.setEntityId(objectDo.getObjectId());
				objectResourceDo.setForClass(parts.length > 1 ? Byte.valueOf(parts[1]) : null);
				objectResourceDo.setForSubclass(parts.length > 2 ? parts[2] : "");
				objectResourceDo.setFinishProcess(BoolEnum.FALSE.getCode());
				objectResourceDo.setAddTime(now);
				objectResourceDo.setUpdTime(now);
				objectResourceDoList.add(objectResourceDo);
			}
		}

		objectDao.insertObject(objectDo);
		for (ObjectResourceDo objectResourceDo : objectResourceDoList) {
			resourceDao.insertObjectResource(objectResourceDo);
		}

		ObjectBo objectBo = new ObjectBo();
		BeanUtils.copyProperties(objectDo, objectBo);
		objectBo.setResourceList(resourceService.listResource(EntityTypeEnum.OBJECT.getCode(), objectDo.getObjectId()));

		return objectBo;
	}

	/**
	 * 生成一个新的UserId
	 *
	 * @return
	 */
	protected Long generateObjectId() {
		String day = DateUtil.format(DateUtil.now(), DateUtil.PATTERN_YEAR2DAY);
		String seq = sequenceDao.getSequence(SequenceDao.SEQ_OBJECT_ID) + "";
		String rt = day + StringUtils.leftPad(seq, 10, '0');
		return Long.valueOf(rt);
	}
}
