package com.xjd.ct.app.ctrlr.v11;

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
import com.xjd.ct.app.view.vo.SchoolObjectVo;
import com.xjd.ct.biz.bo.ObjectBo;
import com.xjd.ct.biz.service.ObjectQueryService;
import com.xjd.ct.utl.valid.ValidationUtil;

/**
 * @author elvis.xu
 * @since 2015-05-01 11:21
 */
@Controller
@RequestMapping("/11")
public class ObjectQueryController11 {
	@Autowired
	ObjectQueryService objectQueryService;

	@RequestMapping("/listRecommendObjects")
	@ResponseBody
	public View listRecommendObjects(@RequestParam(value = "offset", required = false) String offset,
			@RequestParam(value = "count", required = false) String count) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.OFFSET, offset, ValidationUtil.COUNT, count);

		Long offsetL = Long.valueOf(offset);
		Integer countI = Integer.valueOf(count);

		// 业务调用
		List<ObjectBo> objectBoList = objectQueryService.listRecommendObjects11(RequestContext.getUserId(), offsetL, countI);

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

	@RequestMapping("/listSchools")
	@ResponseBody
	public View listSchools(@RequestParam(value = "objectId", required = false) String objectId,
			@RequestParam(value = "turn", required = false) String turn,
			@RequestParam(value = "count", required = false) String count) {
		// 参数校验
		objectId = StringUtils.trimToNull(objectId);
		if (objectId != null) {
			ValidationUtil.check(ValidationUtil.OBJECT_ID, objectId);
		}

		ValidationUtil.check(ValidationUtil.TURN, turn, ValidationUtil.COUNT, count);

		Long objectIdL = null;
		if (objectId != null) {
			objectIdL = Long.valueOf(objectId);
		}
		Boolean turnDown = "0".equals(turn);
		Integer countI = Integer.valueOf(count);

		// 业务调用
		List<ObjectBo> objectBoList = objectQueryService.listSchools(RequestContext.getUserId(), objectIdL, countI,
				turnDown);

		// 返回结果
		List<ObjectVo> objectVoList = new ArrayList<ObjectVo>(objectBoList.size());
		for (ObjectBo objectBo : objectBoList) {
			ObjectVo objectVo = new SchoolObjectVo();
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
