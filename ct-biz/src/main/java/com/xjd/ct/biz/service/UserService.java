package com.xjd.ct.biz.service;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.biz.bo.TokenBo;
import com.xjd.ct.biz.bo.UserBo;
import com.xjd.ct.dal.dao.SequenceDao;
import com.xjd.ct.dal.dao.TokenDao;
import com.xjd.ct.dal.dao.UserDao;
import com.xjd.ct.utl.AppUtil;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.DigestUtil;
import com.xjd.ct.utl.constant.AppConstant;
import com.xjd.ct.utl.enums.BoolEnum;
import com.xjd.ct.utl.enums.ObjectTypeEnum;
import com.xjd.ct.utl.enums.ResForClassEnum;
import com.xjd.ct.utl.enums.UserSexEnum;
import com.xjd.ct.utl.enums.UserStatusEnum;
import com.xjd.ct.utl.enums.UserTypeEnum;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

/**
 * <pre>
 * 用户和授权服务
 * 
 * </pre>
 * 
 * @author elvis.xu
 * @since 2015-4-30 下午5:57:04
 */
@Service
public class UserService {
	@Autowired
	SequenceDao sequenceDao;
	@Autowired
	TokenDao tokenDao;
	@Autowired
	UserDao userDao;
	@Autowired
	ObjectResourceDao objectResourceDao;

	// ===============TOKEN=============== //

	/**
	 * 根据用户IP生成Token
	 * 
	 * @param userIp
	 * @return
	 */
	@Transactional
	public TokenBo genTokenForUserIp(String userIp) {
		// 查询作废以前的Token
		if (tokenDao.selectByUserIpAndUserId(userIp, AppConstant.ANONYMOUS_USERID) != null) { // 先查询后删除用于优化
			tokenDao.deleteByUserIpAndUserId(userIp, AppConstant.ANONYMOUS_USERID);
		}

		// 生成新的Token
		TokenModel tokenModel = new TokenModel();
		tokenModel.setToken(generateToken());
		tokenModel.setSalt(generateSalt());
		tokenModel.setUserIp(userIp);
		tokenModel.setUserId(AppConstant.ANONYMOUS_USERID);
		Date now = DateUtil.now();
		tokenModel.setAddTime(now);
		tokenModel.setUpdTime(now);
		tokenDao.insert(tokenModel);

		return BeanTansferUtil.transferTokenDoToTokenBo(tokenModel);
	}

	/**
	 * 根据用户IP和用户ID生成Token
	 * 
	 * @param userIp
	 * @param userId
	 * @return
	 */
	@Transactional
	public TokenBo genTokenForUser(String userIp, Long userId) {
		// 查询作废以前的Token
		if (tokenDao.selectByUserId(userId) != null) { // 先查询后删除用于优化
			tokenDao.deleteByUserId(userId);
		}

		// 生成新的Token
		TokenModel tokenModel = new TokenModel();
		tokenModel.setToken(generateToken());
		tokenModel.setSalt(generateSalt());
		tokenModel.setUserIp(userIp);
		tokenModel.setUserId(userId);
		Date now = DateUtil.now();
		tokenModel.setAddTime(now);
		tokenModel.setUpdTime(now);
		tokenDao.insert(tokenModel);

		return BeanTansferUtil.transferTokenDoToTokenBo(tokenModel);
	}

	/**
	 * 根据token查询TOKEN信息
	 * 
	 * @param token
	 * @return
	 */
	@Transactional(readOnly = true)
	public TokenBo queryTokenByToken(String token) {
		TokenModel tokenDo = tokenDao.selectByToken(token);
		return BeanTansferUtil.transferTokenDoToTokenBo(tokenDo);
	}

	/**
	 * 判断Token是否有效
	 * 
	 * @param token
	 */
	public void checkToken(TokenBo token) {
		if (token == null) {
			throw new BusinessException(RespCode.RESP_0101);
		}
		// TODO 其它过期校验
	}

	/**
	 * 更新token的时间 在每次使用token访问时调用该方法
	 * 
	 * @param token
	 */
	@Transactional
	public void updateToken(String token) {
		tokenDao.updateUpdTimeByToken(DateUtil.now(), token);
	}

	/**
	 * 删除TOKEN
	 * 
	 * @param token
	 */
	@Transactional
	public void deleteToken(String token) {
		tokenDao.deleteByToken(token);
	}

	/**
	 * 生成token
	 * 
	 * @return
	 */
	protected String generateToken() {
		return UUID.randomUUID().toString().toUpperCase().replace("-", "");
	}

	/**
	 * 生成Salt
	 * 
	 * @return
	 */
	protected String generateSalt() {
		return generateToken();
	}

	// ===============USER=============== //

	/**
	 * 通过userId查询用户
	 * 
	 * @param userId
	 * @return 查询不到时返回null
	 */
	@Transactional(readOnly = true)
	public UserBo queryUserByUserId(Long userId) {
		UserModel userDo = userDao.selectUserByUserId(userId);

		return BeanTansferUtil.transferUserDoToUserBo(userDo);
	}

	/**
	 * 检查用户名是否存在
	 * 
	 * @param username
	 */
	@Transactional(readOnly = true)
	public boolean isUserExists(String username) {
		return userDao.isMobileOrEmailExists(username);
	}

	/**
	 * 注册
	 * 
	 * @param username
	 * @param password
	 */
	@Transactional
	public void signup(String username, String password) {
		// 校验用户名是否可用
		int mobileOrEmail = AppUtil.mobileOrEmail(username);
		if (isUserExists(username)) {
			if (mobileOrEmail == 1) {
				throw new BusinessException(RespCode.RESP_0121);
			} else {
				throw new BusinessException(RespCode.RESP_0122);
			}
		}

		Date now = DateUtil.now();
		// 用户基本信息
		UserModel userDo = new UserModel();
		userDo.setUserId(generateUserId());
		userDo.setPassword(encryptPassword(password));
		userDo.setMobile(mobileOrEmail == 1 ? username : "");
		userDo.setMobileVerifyFlag(BoolEnum.FALSE.getCode());
		userDo.setEmail(mobileOrEmail == 2 ? username : "");
		userDo.setEmailVerifyFlag(BoolEnum.FALSE.getCode());
		userDo.setQqBindFlag(BoolEnum.FALSE.getCode());
		userDo.setWeixinBindFlag(BoolEnum.FALSE.getCode());
		userDo.setSinaWeiboBindFlag(BoolEnum.FALSE.getCode());
		userDo.setTecentWeiboFlag(BoolEnum.FALSE.getCode());
		userDo.setFailTimes((short) 0);
		userDo.setUserStatus(UserStatusEnum.NO_INFO.getCode());
		userDo.setAddTime(now);
		userDao.insertUser(userDo);

		// 用户信息
		UserInfoModel userInfoModel = new UserInfoModel();
		userInfoModel.setUserId(userDo.getUserId());
		userInfoModel.setUserType(UserTypeEnum.NORMAL.getCode());
		userInfoModel.setGradeExp(0);
		userInfoModel.setGradeLevel((byte) 0);
		userInfoModel.setPoint(0);
		userInfoModel.setNickname(generateNickname(UserSexEnum.FEMALE));
		userInfoModel.setSex(UserSexEnum.FEMALE.getCode());
		userInfoModel.setAddTime(now);
		userInfoModel.setUpdTime(now);
		userDao.insertUserInfo(userInfoModel);

		// 用户计数信息
		UserSummaryModel userSummaryModel = new UserSummaryModel();
		userSummaryModel.setUserId(userDo.getUserId());
		userSummaryModel.setInformCount(0);
		userSummaryModel.setFavorCount(0);
		userSummaryModel.setPublishCount(0);
		userSummaryModel.setIdolCount(0);
		userSummaryModel.setFansCount(0);
		userSummaryModel.setAddTime(now);
		userSummaryModel.setUpdTime(now);
		userDao.insertUserSummary(userSummaryModel);

		// TODO 发送验证信息
	}

	/**
	 * 登录
	 * 
	 * @param username
	 * @param password
	 * @param userIp
	 * @param originalToken
	 * @return
	 */
	public TokenBo signin(String username, String password, String userIp, String originalToken) {
		UserModel userModel = userDao.selectUserByUsername(username);
		if (userModel == null) { // 用户名或密码错误
			throw new BusinessException(RespCode.RESP_0112);
		}

		UserStatusEnum statusEnum = UserStatusEnum.valueOfCode(userModel.getUserStatus());
		// if (statusEnum == UserStatusEnum.LOCKED) {
		// throw new BusinessException(RespCode.RESP_0114);
		// }
		if (statusEnum == UserStatusEnum.NON_ACTIVE) {
			throw new BusinessException(RespCode.RESP_0115);
		}

		String pwd = encryptPassword(password);
		if (!StringUtils.equals(pwd, userModel.getPassword())) {
			// 更新登录失败次数
			userDao.increaseFailTimesByUserId(userModel.getUserId());
			// 超过指定次数锁定账户 TODO

			throw new BusinessException(RespCode.RESP_0112);
		}

		if (userModel.getFailTimes() > 0) {
			// 清零
			userDao.clearFailTimesByUserId(userModel.getUserId());
		}

		TokenBo tokenBo = genTokenForUser(userIp, userModel.getUserId());

		// 作废原有的TOKEN
		deleteToken(originalToken);

		return tokenBo;
	}

	/**
	 * 登出
	 * 
	 * @param userId
	 */
	@Transactional
	public void signout(Long userId) {
		tokenDao.deleteByUserId(userId);
	}

	/**
	 * 修改密码
	 * 
	 * @param userId
	 * @param password
	 * @param newPassword
	 */
	@Transactional
	public void changePassword(Long userId, String password, String newPassword) {
		UserModel userModel = userDao.selectUserByUserId(userId);

		if (userModel == null) {
			throw new BusinessException(RespCode.RESP_0110);
		}

		if (!StringUtils.equals(encryptPassword(password), userModel.getPassword())) {
			throw new BusinessException(RespCode.RESP_0113);
		}

		userDao.updatePasswordByUserId(encryptPassword(newPassword), userId);
	}

	/**
	 * 设置用户信息
	 * 
	 * @param userId
	 * @param headImgRes
	 * @param nickname
	 * @param sex
	 * @param moodWords
	 * @param babyBirth
	 * @param babySex
	 */
	@Transactional
	public void setUserInfo(Long userId, String headImgRes, String nickname, Byte sex, String moodWords,
			Date babyBirth, Byte babySex) {
		// 更新用户信息
		UserInfoModel userInfoModel = userDao.selectUserInfoByUserId(userId);

		if (userInfoModel == null) {
			throw new BusinessException(RespCode.RESP_0110);
		}

		Date now = DateUtil.now();
		userInfoModel.setNickname(nickname);
		userInfoModel.setSex(sex);
		userInfoModel.setMoodWords(moodWords);
		userInfoModel.setMoodWordsTime(now);
		userInfoModel.setUpdTime(now);
		userDao.updateUserInfoByUserId(userInfoModel);

		// 更新用户头像信息
		objectResourceDao.deleteByObjectTypeAndObjectRefId(ObjectTypeEnum.USER.getCode(), userId);
		if (StringUtils.isNotBlank(headImgRes)) {
			String[] headImgArray = headImgRes.split(";");
			for (String headImg : headImgArray) {
				headImg = StringUtils.trim(headImg);
				String[] parts = headImg.split(",");
				ObjectResourceModel objectResourceModel = new ObjectResourceModel();
				objectResourceModel.setObjectType(ObjectTypeEnum.USER.getCode());
				objectResourceModel.setObjectRefId(userId);
				objectResourceModel.setResId(parts[0].trim());
				objectResourceModel.setForClass(ResForClassEnum.HEAD_IMG.getCode());
				objectResourceModel.setForSubclass(parts.length > 1 ? parts[1].trim() : "");
				objectResourceModel.setAddTime(now);
				objectResourceDao.insert(objectResourceModel);
			}
		}

		// 更新用户宝宝信息
		List<UserBabyModel> babyModelList = userDao.selectUserBabyByUserId(userId);
		if (babyModelList.size() > 0) {
			// 更新
			UserBabyModel babyModel = babyModelList.get(0);
			babyModel.setBabySex(babySex);
			babyModel.setBabyBirth(babyBirth);
			babyModel.setUpdTime(now);
			userDao.updateUserBabyByBabyId(babyModel);
		} else {
			// 插入
			UserBabyModel babyModel = new UserBabyModel();
			babyModel.setBabyId(generateBabyId());
			babyModel.setUserId(userId);
			babyModel.setBabySex(babySex);
			babyModel.setBabyBirth(babyBirth);
			babyModel.setAddTime(now);
			babyModel.setUpdTime(now);
			userDao.insertUserBaby(babyModel);
		}

		// 查看用户的状态是否为未设置个人信息
		UserModel userModel = userDao.selectUserByUserId(userId);

		if (userModel == null) {
			throw new BusinessException(RespCode.RESP_0110);
		}

		if (UserStatusEnum.valueOfCode(userModel.getUserStatus()) == UserStatusEnum.NO_INFO) {
			userDao.updateUserStatusByUserId(UserStatusEnum.NORMAL.getCode(), userId);
		}
	}

	/**
	 * 生成一个新的UserId
	 * 
	 * @return
	 */
	protected Long generateUserId() {
		String day = DateUtil.format(DateUtil.now(), DateUtil.PATTERN_YEAR2DAY);
		String seq = sequenceDao.getSequence(SequenceDao.SEQ_USER_ID) + "";
		String rt = day + StringUtils.leftPad(seq, 10, '0');
		return Long.valueOf(rt);
	}

	/**
	 * 处理明文密码
	 * 
	 * @param password
	 * @return
	 */
	protected String encryptPassword(String password) {
		return DigestUtil.sha(password);
	}

	/**
	 * 生成一个随机的用户昵称
	 * 
	 * @return
	 */
	protected String generateNickname(UserSexEnum sexEnum) {
		StringBuilder sb = new StringBuilder(10);
		if (sexEnum == UserSexEnum.FEMALE) {
			sb.append("宝妈");
		} else {
			sb.append("宝爸");
		}
		Random r = new Random();
		for (int i = 0; i < 8; i++) {
			sb.append(r.nextInt(10));
		}
		return sb.toString();
	}

	/**
	 * 生成一个新的BabyID
	 * 
	 * @return
	 */
	protected Long generateBabyId() {
		String day = DateUtil.format(DateUtil.now(), DateUtil.PATTERN_YEAR2DAY);
		String seq = sequenceDao.getSequence(SequenceDao.SEQ_USER_BABY_ID) + "";
		String rt = day + StringUtils.leftPad(seq, 10, '0');
		return Long.valueOf(rt);
	}
}
