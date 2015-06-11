package com.xjd.ct.app.ctrlr.v10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjd.ct.app.util.RequestContext;
import com.xjd.ct.app.view.View;
import com.xjd.ct.app.view.ViewUtil;
import com.xjd.ct.biz.service.ObjectUpdateService;
import com.xjd.ct.utl.valid.ValidationUtil;

/**
 * @author elvis.xu
 * @since 2015-06-11 21:43
 */
@Controller
@RequestMapping("/10")
public class ConsoleController10 {

	@Autowired
	ObjectUpdateService objectUpdateService;

	@RequestMapping("/recommendObject")
	@ResponseBody
	public View delObject(@RequestParam(value = "objectId", required = false) String objectId) {
		ValidationUtil.check(ValidationUtil.OBJECT_ID, objectId);

		Long objectIdL = Long.valueOf(objectId);

		// 业务调用
		objectUpdateService.recommendObject(RequestContext.checkAndGetUserId(), objectIdL);

		// 返回结果
		View view = ViewUtil.defaultView();
		return view;
	}
}
