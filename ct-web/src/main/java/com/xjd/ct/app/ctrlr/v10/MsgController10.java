package com.xjd.ct.app.ctrlr.v10;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjd.ct.app.biz.MsgBiz;
import com.xjd.ct.app.util.RequestContext;
import com.xjd.ct.app.view.View;
import com.xjd.ct.app.view.ViewUtil;
import com.xjd.ct.app.view.body.MsgInformListBody;
import com.xjd.ct.app.view.vo.MsgInformVo;
import com.xjd.ct.utl.valid.ValidationUtil;

/**
 * 消息控制器
 * 
 * @author elvis.xu
 * @since 2015-03-26 21:40
 */
@Controller
@RequestMapping("/10")
public class MsgController10 {
	@Autowired
	MsgBiz msgBiz;

	@RequestMapping("/listMyMsgs")
	@ResponseBody
	public View listMyMsgs(@RequestParam(value = "offset", required = false) String offset,
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
		List<MsgInformVo> msgInformVoList = msgBiz.listMsgs(RequestContext.checkAndGetUserId(), offsetI, countI);

		// 返回结果
		MsgInformListBody body = new MsgInformListBody();
		body.setMsgInformList(msgInformVoList);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}
}
