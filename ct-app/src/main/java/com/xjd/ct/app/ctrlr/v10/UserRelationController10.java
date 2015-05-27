package com.xjd.ct.app.ctrlr.v10;

import java.util.ArrayList;
import java.util.List;

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

	@RequestMapping("/listIdols")
	@ResponseBody
	public View listIdols(@RequestParam(value = "userId", required = false) String userId,
						 @RequestParam(value = "offset", required = false) String offset,
						 @RequestParam(value = "count", required = false) String count) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.USER_ID, userId, ValidationUtil.OFFSET, offset, ValidationUtil.COUNT, count);

		Long userIdL = Long.valueOf(userId);
		Long offsetL = Long.valueOf(offset);
		Integer countI = Integer.valueOf(count);

		// 业务调用
		List<UserBo> list = userRelationService.listIdolsOrFans(true, userIdL, offsetL, countI, RequestContext.getUserId());

		// 返回结果
		List<UserInfoForOtherVo> userInfoForOtherVoList = new ArrayList<UserInfoForOtherVo>(list.size());
		for (UserBo userBo : list) {
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

	@RequestMapping("/listFans")
	@ResponseBody
	public View listFans(@RequestParam(value = "userId", required = false) String userId,
			@RequestParam(value = "offset", required = false) String offset,
			@RequestParam(value = "count", required = false) String count) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.USER_ID, userId, ValidationUtil.OFFSET, offset, ValidationUtil.COUNT, count);

		Long userIdL = Long.valueOf(userId);
		Long offsetL = Long.valueOf(offset);
		Integer countI = Integer.valueOf(count);

		// 业务调用
		List<UserBo> list = userRelationService.listIdolsOrFans(false, userIdL, offsetL, countI, RequestContext.getUserId());

		// 返回结果
		List<UserInfoForOtherVo> userInfoForOtherVoList = new ArrayList<UserInfoForOtherVo>(list.size());
		for (UserBo userBo : list) {
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
