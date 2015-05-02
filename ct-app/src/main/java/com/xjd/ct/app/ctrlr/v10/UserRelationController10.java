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
import com.xjd.ct.app.view.body.UserInfoForOtherListBody;
import com.xjd.ct.app.view.vo.UserInfoForOtherVo;
import com.xjd.ct.biz.bo.UserBo;
import com.xjd.ct.biz.service.UserRelationService;
import com.xjd.ct.utl.enums.IdolOperEnum;
import com.xjd.ct.utl.valid.ValidationUtil;

/**
 * 用户关系控制器
 * 
 * @author elvis.xu
 * @since 2015-3-26 上午10:07:25
 */
@Controller
@RequestMapping("/10")
public class UserRelationController10 {
	@Autowired
	UserRelationService userRelationService;

	@RequestMapping("/idolatrizeUser")
	@ResponseBody
	public View idolatrizeUser(@RequestParam(value = "userId", required = false) String userId,
			@RequestParam(value = "idolOper", required = false) String idolOper) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.USER_ID, userId, ValidationUtil.IDOL_OPER, idolOper);

		Long userIdL = Long.valueOf(userId);
		IdolOperEnum idolOperEnum = IdolOperEnum.valueOfCode(Byte.parseByte(idolOper));

		// 业务调用
		if (idolOperEnum == IdolOperEnum.ADD) {
			userRelationService.addIdol(RequestContext.checkAndGetUserId(), userIdL);
		} else {
			userRelationService.cancelIdol(RequestContext.checkAndGetUserId(), userIdL);
		}

		// 返回结果
		View view = ViewUtil.defaultView();
		return view;
	}

	@RequestMapping("/listMyIdols")
	@ResponseBody
	public View listMyIdols(@RequestParam(value = "offset", required = false) String offset,
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
		List<UserBo> idolUserList = userRelationService.listIdols(RequestContext.checkAndGetUserId(), offsetI, countI);

		// 返回结果
		List<UserInfoForOtherVo> userInfoForOtherVoList = new ArrayList<UserInfoForOtherVo>(idolUserList.size());
		for (UserBo userBo : idolUserList) {
			UserInfoForOtherVo userInfoForOtherVo = new UserInfoForOtherVo();
			BeanTransport.copyTo(userBo, userInfoForOtherVo);
			userInfoForOtherVoList.add(userInfoForOtherVo);
		}

		UserInfoForOtherListBody body = new UserInfoForOtherListBody();
		body.setUserInfoList(userInfoForOtherVoList);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}
}
