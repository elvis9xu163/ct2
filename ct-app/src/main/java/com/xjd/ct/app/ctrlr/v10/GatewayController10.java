package com.xjd.ct.app.ctrlr.v10;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjd.ct.app.util.RequestContext;
import com.xjd.ct.app.view.View;
import com.xjd.ct.app.view.ViewUtil;
import com.xjd.ct.app.view.body.AppVersionResultBody;
import com.xjd.ct.app.view.vo.AppVersionResultVo;
import com.xjd.ct.biz.bo.AppVersionResultBo;
import com.xjd.ct.biz.service.GatewayService;
import com.xjd.ct.utl.valid.ValidationUtil;

/**
 * @author elvis.xu
 * @since 2015-05-12 13:48
 */
@Controller
@RequestMapping("/10")
public class GatewayController10 {
	@Autowired
	GatewayService gatewayService;

	@RequestMapping("/checkAppVersion")
	@ResponseBody
	public View checkAppVersion() {

		AppVersionResultBo bo = gatewayService.checkAppVersion(RequestContext.getAppType(),
				RequestContext.getAppVersion());

		View view = ViewUtil.defaultView();
		if (bo != null) {
			AppVersionResultVo vo = new AppVersionResultVo();
			BeanUtils.copyProperties(bo, vo);

			AppVersionResultBody body = new AppVersionResultBody();
			body.setAppVersion(vo);

			view.setBody(body);
		}

		return view;
	}

	@RequestMapping("/feedback")
	@ResponseBody
	public View feedback(@RequestParam(value = "feedbackContent", required = false) String feedbackContent) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.FEEDBACK_CONTENT, feedbackContent);

		// 业务调用
		gatewayService.feedback(RequestContext.checkAndGetUserId(), feedbackContent);

		// 结果封装
		View view = ViewUtil.defaultView();

		return view;
	}
}
