package com.xjd.ct.app.ctrlr.v10;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjd.ct.app.util.RequestContext;
import com.xjd.ct.app.view.View;
import com.xjd.ct.app.view.ViewUtil;
import com.xjd.ct.app.view.body.AppVersionResultBody;
import com.xjd.ct.app.view.vo.AppVersionResultVo;
import com.xjd.ct.biz.bo.AppVersionResultBo;
import com.xjd.ct.biz.service.GatewayService;

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
}
