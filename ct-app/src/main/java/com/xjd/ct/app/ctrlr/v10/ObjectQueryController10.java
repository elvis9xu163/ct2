package com.xjd.ct.app.ctrlr.v10;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjd.ct.app.util.BeanTransport;
import com.xjd.ct.app.util.RequestContext;
import com.xjd.ct.app.view.View;
import com.xjd.ct.app.view.ViewUtil;
import com.xjd.ct.app.view.body.ObjectListBody;
import com.xjd.ct.app.view.vo.ObjectVo;
import com.xjd.ct.biz.bo.ObjectBo;
import com.xjd.ct.biz.service.ObjectQueryService;
import com.xjd.ct.utl.valid.ValidationUtil;

/**
 * @author elvis.xu
 * @since 2015-05-01 11:21
 */
@Controller
@RequestMapping("/10")
public class ObjectQueryController10 {
	@Autowired
	ObjectQueryService objectQueryService;

	@RequestMapping("/listMyPublishs")
	@ResponseBody
	public View listMyPublishs(@RequestParam(value = "offset", required = false) String offset,
			@RequestParam(value = "count", required = false) String count) {
		// 参数校验
		if (StringUtils.isNotEmpty(offset)) {
			ValidationUtil.check(ValidationUtil.OFFSET, offset);
		}
		if (StringUtils.isNotEmpty(count)) {
			ValidationUtil.check(ValidationUtil.COUNT, count);
		}

		long offsetI = 1;
		int countI = 20;

		if (StringUtils.isNotEmpty(offset)) {
			offsetI = Long.parseLong(offset);
			if (offsetI < 1) {
				offsetI = 1;
			}
		}

		if (StringUtils.isNotEmpty(count)) {
			countI = Integer.parseInt(count);
			if (countI < 1) {
				countI = 1;
			} else if (countI > 100) {
				countI = 100;
			}
		}

		// 业务调用
		List<ObjectBo> objectBoList = objectQueryService
				.listObject(RequestContext.checkAndGetUserId(), offsetI, countI);

		// 返回结果
		List<ObjectVo> objectVoList = new ArrayList<ObjectVo>(objectBoList.size());
		for (ObjectBo objectBo : objectBoList) {
			ObjectVo objectVo = new ObjectVo();
			BeanTransport.copyTo(objectBo, objectVo);
			objectVoList.add(objectVo);
		}

		ObjectListBody body = new ObjectListBody();
		body.setObjectList(objectVoList);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

	@RequestMapping("/listMyFavors")
	@ResponseBody
	public View listMyFavors(@RequestParam(value = "offset", required = false) String offset,
			@RequestParam(value = "count", required = false) String count) {
		// 参数校验
		if (StringUtils.isNotEmpty(offset)) {
			ValidationUtil.check(ValidationUtil.OFFSET, offset);
		}
		if (StringUtils.isNotEmpty(count)) {
			ValidationUtil.check(ValidationUtil.COUNT, count);
		}

		long offsetI = 1;
		int countI = 20;

		if (StringUtils.isNotEmpty(offset)) {
			offsetI = Long.parseLong(offset);
			if (offsetI < 1) {
				offsetI = 1;
			}
		}

		if (StringUtils.isNotEmpty(count)) {
			countI = Integer.parseInt(count);
			if (countI < 1) {
				countI = 1;
			} else if (countI > 100) {
				countI = 100;
			}
		}

		// 业务调用
		List<ObjectBo> objectBoList = objectQueryService
				.listFavors(RequestContext.checkAndGetUserId(), offsetI, countI);

		// 返回结果
		List<ObjectVo> objectVoList = new ArrayList<ObjectVo>(objectBoList.size());
		for (ObjectBo objectBo : objectBoList) {
			ObjectVo objectVo = new ObjectVo();
			BeanTransport.copyTo(objectBo, objectVo);
			objectVoList.add(objectVo);
		}

		ObjectListBody body = new ObjectListBody();
		body.setObjectList(objectVoList);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

	@RequestMapping("/listMyLikes")
	@ResponseBody
	public View listMyLikes(@RequestParam(value = "offset", required = false) String offset,
			@RequestParam(value = "count", required = false) String count) {
		// 参数校验
		if (StringUtils.isNotEmpty(offset)) {
			ValidationUtil.check(ValidationUtil.OFFSET, offset);
		}
		if (StringUtils.isNotEmpty(count)) {
			ValidationUtil.check(ValidationUtil.COUNT, count);
		}

		long offsetI = 1;
		int countI = 20;

		if (StringUtils.isNotEmpty(offset)) {
			offsetI = Long.parseLong(offset);
			if (offsetI < 1) {
				offsetI = 1;
			}
		}

		if (StringUtils.isNotEmpty(count)) {
			countI = Integer.parseInt(count);
			if (countI < 1) {
				countI = 1;
			} else if (countI > 100) {
				countI = 100;
			}
		}

		// 业务调用
		List<ObjectBo> objectBoList = objectQueryService
				.listLikes(RequestContext.checkAndGetUserId(), offsetI, countI);

		// 返回结果
		List<ObjectVo> objectVoList = new ArrayList<ObjectVo>(objectBoList.size());
		for (ObjectBo objectBo : objectBoList) {
			ObjectVo objectVo = new ObjectVo();
			BeanTransport.copyTo(objectBo, objectVo);
			objectVoList.add(objectVo);
		}

		ObjectListBody body = new ObjectListBody();
		body.setObjectList(objectVoList);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

}
