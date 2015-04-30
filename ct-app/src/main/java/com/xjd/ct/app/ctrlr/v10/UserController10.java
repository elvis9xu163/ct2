package com.xjd.ct.app.ctrlr.v10;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjd.ct.app.biz.UserBiz;
import com.xjd.ct.app.util.RequestContext;
import com.xjd.ct.app.view.View;
import com.xjd.ct.app.view.ViewUtil;
import com.xjd.ct.app.view.body.ExistsBody;
import com.xjd.ct.app.view.body.TokenBody;
import com.xjd.ct.app.view.body.UserInfoBody;
import com.xjd.ct.app.view.vo.UserForOtherVo;
import com.xjd.ct.app.view.vo.UserForSelfVo;
import com.xjd.ct.biz.bo.TokenBo;
import com.xjd.ct.biz.service.UserService;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.enums.BoolEnum;
import com.xjd.ct.utl.enums.UserSexEnum;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;
import com.xjd.ct.utl.valid.ValidationUtil;

/**
 * 用户/授权控制器
 * 
 * @author elvis.xu
 * @since 2015-3-26 上午10:07:25
 */
@Controller
@RequestMapping("/10")
public class UserController10 {
	@Autowired
	UserService userService;
	@Autowired
	UserBiz userBiz;

	@RequestMapping("/getToken")
	@ResponseBody
	public View getToken() {
		// 业务调用
		TokenBo tokenBo = userService.genTokenForUserIp(RequestContext.getUserIp());

		// 结果封装
		TokenBody body = new TokenBody();
		body.setToken(tokenBo.getToken());
		body.setSalt(tokenBo.getSalt());

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

	@RequestMapping("/isUserExists")
	@ResponseBody
	public View isUserExists(@RequestParam(value = "username", required = false) String username) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.USERNAME, username);

		// 业务调用
		boolean exists = userService.isUserExists(username);

		// 结果封装
		ExistsBody body = new ExistsBody();
		body.setExistsFlag(exists ? BoolEnum.TRUE.getCode() : BoolEnum.FALSE.getCode());

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

	@RequestMapping("/signup")
	@ResponseBody
	public View signup(@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "password", required = false) String password) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.USERNAME, username, ValidationUtil.PASSWORD, password);

		// 业务调用
		userService.signup(username, password);

		// 结果封装
		View view = ViewUtil.defaultView();
		return view;
	}

	@RequestMapping("/signin")
	@ResponseBody
	public View signin(@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "password", required = false) String password,
			@RequestParam(value = "token", required = false) String token) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.USERNAME, username, ValidationUtil.PASSWORD, password);

		// 业务调用
		TokenBo tokenBo = userService.signin(username, password, RequestContext.getUserIp(), token);

		// 结果封装
		TokenBody body = new TokenBody();
		body.setToken(tokenBo.getToken());
		body.setSalt(tokenBo.getSalt());

		View view = ViewUtil.defaultView();
		view.setBody(body);

		return view;
	}

	@RequestMapping("/signout")
	@ResponseBody
	public View signout() {
		// 业务调用
		userService.signout(RequestContext.checkAndGetUserId());

		// 结果封装
		View view = ViewUtil.defaultView();

		return view;
	}

	@RequestMapping("/changePassword")
	@ResponseBody
	public View changePassword(@RequestParam(value = "password", required = false) String password,
			@RequestParam(value = "newPassword", required = false) String newPassword) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.PASSWORD, password, ValidationUtil.PASSWORD, newPassword);

		// 业务调用
		userService.changePassword(RequestContext.checkAndGetUserId(), password, newPassword);

		// 结果封装
		View view = ViewUtil.defaultView();

		return view;
	}

	@RequestMapping("/getUserInfo")
	@ResponseBody
	public View getUserInfo() {
		// 业务调用
		UserForSelfVo userForSelfVo = userBiz.getUserInfoForSelf(RequestContext.checkAndGetUserId());

		if (userForSelfVo == null) {
			throw new BusinessException(RespCode.RESP_0110);
		}

		// 结果封装
		UserInfoBody body = new UserInfoBody();
		body.setUserInfo(userForSelfVo);

		View view = ViewUtil.defaultView();
		view.setBody(body);

		return view;
	}

	@RequestMapping("/getUserInfoOfOthers")
	@ResponseBody
	public View getUserInfoOfOthers(@RequestParam(value = "userId", required = false) String userId) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.USER_ID, userId);

		Long userIdL = Long.valueOf(userId);

		// 业务调用
		UserForOtherVo userForOtherVo = userBiz.getUserInfoForOther(userIdL);

		if (userForOtherVo == null) {
			throw new BusinessException(RespCode.RESP_0110);
		}

		// 结果封装
		UserInfoBody body = new UserInfoBody();
		body.setUserInfo(userForOtherVo);

		View view = ViewUtil.defaultView();
		view.setBody(body);

		return view;
	}

	@RequestMapping("/setUserInfo")
	@ResponseBody
	public View setUserInfo(@RequestParam(value = "headImgRes", required = false) String headImgRes,
			@RequestParam(value = "nickname", required = false) String nickname,
			@RequestParam(value = "sex", required = false) String sex,
			@RequestParam(value = "moodWords", required = false) String moodWords,
			@RequestParam(value = "babyBirth", required = false) String babyBirth,
			@RequestParam(value = "babySex", required = false) String babySex) {

		// 参数校验
		Byte sexB = UserSexEnum.FEMALE.getCode();
		if (StringUtils.isNotEmpty(sex)) {
			ValidationUtil.check(ValidationUtil.SEX, sex);
			sexB = Byte.valueOf(sex);
		}
		Byte babySexB = UserSexEnum.FEMALE.getCode();
		if (StringUtils.isNotEmpty(babySex)) {
			ValidationUtil.check(ValidationUtil.SEX, babySex);
			babySexB = Byte.valueOf(babySex);
		}
		Date babyBirthDate = null;
		if (StringUtils.isNotEmpty(babyBirth)) {
			ValidationUtil.check(ValidationUtil.BABY_BIRTH, babyBirth);
			babyBirthDate = DateUtil.parse(babyBirth, DateUtil.PATTERN_YEAR2DAY);
		}

		userService.setUserInfo(RequestContext.checkAndGetUserId(), headImgRes, nickname, sexB, moodWords,
				babyBirthDate, babySexB);

		View view = ViewUtil.defaultView();
		return view;
	}

}
