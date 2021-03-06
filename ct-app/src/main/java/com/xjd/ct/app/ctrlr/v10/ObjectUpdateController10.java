package com.xjd.ct.app.ctrlr.v10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjd.ct.app.util.BeanTransport;
import com.xjd.ct.app.util.RequestContext;
import com.xjd.ct.app.view.View;
import com.xjd.ct.app.view.ViewUtil;
import com.xjd.ct.app.view.body.ObjectBody;
import com.xjd.ct.app.view.vo.ObjectVo;
import com.xjd.ct.biz.bo.ObjectBo;
import com.xjd.ct.biz.service.ObjectUpdateService;
import com.xjd.ct.utl.valid.ValidationUtil;

/**
 * @author elvis.xu
 * @since 2015-05-02 22:06
 */
@Controller
@RequestMapping("/10")
public class ObjectUpdateController10 {
	@Autowired
	ObjectUpdateService objectUpdateService;

	@RequestMapping("/addPublish")
	@ResponseBody
	public View addPublish(@RequestParam(value = "title", required = false) String title,
			@RequestParam(value = "content", required = false) String content,
			@RequestParam(value = "resources", required = false) String resources) {
		// TODO 参数校验

		// 业务调用
		ObjectBo objectBo = objectUpdateService.addPublish(RequestContext.checkAndGetUserId(), title, content,
				resources);

		// 返回结果
		View view = ViewUtil.defaultView();

		if (objectBo != null) {
			ObjectVo vo = new ObjectVo();
			BeanTransport.copyTo(objectBo, vo);

			ObjectBody body = new ObjectBody();
			body.setObject(vo);
			view.setBody(body);
		}

		return view;
	}

	@RequestMapping("/delObject")
	@ResponseBody
	public View delObject(@RequestParam(value = "objectId", required = false) String objectId) {
		ValidationUtil.check(ValidationUtil.OBJECT_ID, objectId);

		Long objectIdL = Long.valueOf(objectId);

		// 业务调用
		objectUpdateService.delObject(RequestContext.checkAndGetUserId(), objectIdL);

		// 返回结果
		View view = ViewUtil.defaultView();
		return view;
	}
}
