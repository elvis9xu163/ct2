package com.xjd.ct.app.ctrlr.v10;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjd.ct.app.util.RequestContext;
import com.xjd.ct.app.view.View;
import com.xjd.ct.app.view.ViewUtil;
import com.xjd.ct.app.view.body.AgeBracketListBody;
import com.xjd.ct.app.view.body.SubscribeListBody;
import com.xjd.ct.app.view.vo.AgeBracketVo;
import com.xjd.ct.app.view.vo.SubscribeVo;
import com.xjd.ct.biz.bo.AgeBracketBo;
import com.xjd.ct.biz.bo.SubscribeBo;
import com.xjd.ct.biz.service.SubscribeService;
import com.xjd.ct.utl.valid.ValidationUtil;

/**
 * 订阅控制器
 * 
 * @author elvis.xu
 * @since 2015-03-26 21:40
 */
@Controller
@RequestMapping("/10")
public class SubscribeController10 {
	@Autowired
	SubscribeService subscribeService;

	@RequestMapping("/listSubscriptions")
	@ResponseBody
	public View listSubscriptions() {
		// 业务调用
		List<SubscribeBo> subscribeBoList = subscribeService.listSubscriptions();

		// 返回结果
		List<SubscribeVo> subscribeVoList = new ArrayList<SubscribeVo>(subscribeBoList.size());
		for (SubscribeBo bo : subscribeBoList) {
			SubscribeVo vo = new SubscribeVo();
			BeanUtils.copyProperties(bo, vo);
			subscribeVoList.add(vo);
		}

		SubscribeListBody body = new SubscribeListBody();
		body.setSubscribeList(subscribeVoList);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

	@RequestMapping("/listAgeBrackets")
	@ResponseBody
	public View listAgeBrackets() {
		// 业务调用
		List<AgeBracketBo> ageBracketBoList = subscribeService.listAgeBrackets();

		// 返回结果
		List<AgeBracketVo> ageBracketVoList = new ArrayList<AgeBracketVo>(ageBracketBoList.size());
		for (AgeBracketBo bo : ageBracketBoList) {
			AgeBracketVo vo = new AgeBracketVo();
			BeanUtils.copyProperties(bo, vo);
			ageBracketVoList.add(vo);
		}

		AgeBracketListBody body = new AgeBracketListBody();
		body.setAgeBracketList(ageBracketVoList);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

	@RequestMapping("/listSubscriptionsOfUser")
	@ResponseBody
	public View listSubscriptionsOfUser() {
		// 业务调用
		List<SubscribeBo> subscribeBoList = subscribeService
				.listSubscriptionsOfUser(RequestContext.checkAndGetUserId());

		// 返回结果
		List<SubscribeVo> subscribeVoList = new ArrayList<SubscribeVo>(subscribeBoList.size());
		for (SubscribeBo bo : subscribeBoList) {
			SubscribeVo vo = new SubscribeVo();
			BeanUtils.copyProperties(bo, vo);
			subscribeVoList.add(vo);
		}

		SubscribeListBody body = new SubscribeListBody();
		body.setSubscribeList(subscribeVoList);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

	@RequestMapping("/listAgeBracketsOfUser")
	@ResponseBody
	public View listAgeBracketsOfUser() {
		// 业务调用
		List<AgeBracketBo> ageBracketBoList = subscribeService
				.listAgeBracketsOfUser(RequestContext.checkAndGetUserId());

		// 返回结果
		List<AgeBracketVo> ageBracketVoList = new ArrayList<AgeBracketVo>(ageBracketBoList.size());
		for (AgeBracketBo bo : ageBracketBoList) {
			AgeBracketVo vo = new AgeBracketVo();
			BeanUtils.copyProperties(bo, vo);
			ageBracketVoList.add(vo);
		}

		AgeBracketListBody body = new AgeBracketListBody();
		body.setAgeBracketList(ageBracketVoList);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

	@RequestMapping("/subscribe")
	@ResponseBody
	public View subscribe(@RequestParam(value = "subscribeId", required = false) String subscribeId,
			@RequestParam(value = "subscribe", required = false) String subscribe) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.SUBSCRIBE_ID, subscribeId, ValidationUtil.SUBSCRIBE, subscribe);

		Long subscribeIdL = Long.valueOf(subscribeId);

		// 业务调用
		if ("1".equals(subscribe)) {
			subscribeService.subscribe(RequestContext.checkAndGetUserId(), subscribeIdL);
		} else {
			subscribeService.unsubscribe(RequestContext.checkAndGetUserId(), subscribeIdL);
		}

		// 返回结果
		View view = ViewUtil.defaultView();
		return view;
	}

	@RequestMapping("/setAgeBracket")
	@ResponseBody
	public View setAgeBracket(@RequestParam(value = "ageBracketId", required = false) String ageBracketId,
			@RequestParam(value = "set", required = false) String set) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.AGE_BRACKET_ID, ageBracketId, ValidationUtil.SET, set);

		Long ageBracketIdL = Long.valueOf(ageBracketId);

		// 业务调用
		if ("1".equals(set)) {
			subscribeService.setAgeBracket(RequestContext.checkAndGetUserId(), ageBracketIdL);
		} else {
			subscribeService.unsetAgeBracket(RequestContext.checkAndGetUserId(), ageBracketIdL);
		}

		// 返回结果
		View view = ViewUtil.defaultView();
		return view;
	}
}
