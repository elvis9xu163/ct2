package com.xjd.ct.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.biz.bo.*;
import com.xjd.ct.dal.dao.ResourceDao;
import com.xjd.ct.dal.dao.SequenceDao;
import com.xjd.ct.dal.dao.TokenDao;
import com.xjd.ct.dal.dao.UserDao;
import com.xjd.ct.dal.dos.*;
import com.xjd.ct.utl.AppUtil;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.DigestUtil;
import com.xjd.ct.utl.constant.AppConstant;
import com.xjd.ct.utl.enums.*;
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
	ResourceDao resourceDao;

	@Autowired
	ResourceService resourceService;

	/**
	 * 根据用户IP生成Token
	 *
	 * @param userIp
	 * @return
	 */
	@Transactional
	public TokenBo genTokenForUserIp(String userIp) {
		// 查询作废以前的Token
		// 考虑到多用户使用同一个WIFI上网，不能同IP只能有一个用户登录
		// if (tokenDao.selectByUserIpAndUserId(userIp, AppConstant.ANONYMOUS_USERID) != null) { // 先查询后删除用于优化
		// tokenDao.deleteByUserIpAndUserId(userIp, AppConstant.ANONYMOUS_USERID);
		// }

		// 生成新的Token
		TokenDo tokenDo = new TokenDo();
		tokenDo.setToken(generateToken());
		tokenDo.setSalt(generateSalt());
		tokenDo.setUserIp(userIp);
		tokenDo.setUserId(AppConstant.ANONYMOUS_USERID);
		Long now = DateUtil.nowInMilliseconds();
		tokenDo.setAddTime(now);
		tokenDo.setUpdTime(now);
		tokenDao.insert(tokenDo);

		TokenBo tokenBo = new TokenBo();
		BeanUtils.copyProperties(tokenDo, tokenBo);

		return tokenBo;
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
		TokenDo tokenDo = new TokenDo();
		tokenDo.setToken(generateToken());
		tokenDo.setSalt(generateSalt());
		tokenDo.setUserIp(userIp);
		tokenDo.setUserId(userId);
		Long now = DateUtil.nowInMilliseconds();
		tokenDo.setAddTime(now);
		tokenDo.setUpdTime(now);
		tokenDao.insert(tokenDo);

		TokenBo tokenBo = new TokenBo();
		BeanUtils.copyProperties(tokenDo, tokenBo);

		return tokenBo;
	}

	/**
	 * 根据token查询TOKEN信息
	 *
	 * @param token
	 * @return
	 */
	@Transactional(readOnly = true)
	public TokenBo queryTokenByToken(String token) {
		TokenDo tokenDo = tokenDao.selectByToken(token);

		TokenBo tokenBo = null;
		if (tokenDo != null) {
			tokenBo = new TokenBo();
			BeanUtils.copyProperties(tokenDo, tokenBo);
		}

		return tokenBo;
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
		tokenDao.updateUpdTimeByToken(DateUtil.nowInMilliseconds(), token);
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
		UserDo userDo = userDao.selectUserByUserId(userId);

		UserBo userBo = null;
		if (userDo != null) {
			userBo = new UserBo();
			BeanUtils.copyProperties(userDo, userBo);
		}

		return userBo;
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

		UserDo userDo = new UserDo();
		userDo.setUserId(generateUserId());
		userDo.setPassword(encryptPassword(password));
		userDo.setMobile(mobileOrEmail == 1 ? username : "");
		userDo.setVerifyMobileFlag(BoolEnum.FALSE.getCode());
		userDo.setEmail(mobileOrEmail == 2 ? username : "");
		userDo.setVerifyEmailFlag(BoolEnum.FALSE.getCode());
		userDo.setBindQqFlag(BoolEnum.FALSE.getCode());
		userDo.setBindWeixinFlag(BoolEnum.FALSE.getCode());
		userDo.setBindSinaWeiboFlag(BoolEnum.FALSE.getCode());
		userDo.setBindTecentWeiboFlag(BoolEnum.FALSE.getCode());
		userDo.setFailTimes((short) 0);
		userDo.setUserStatus(UserStatusEnum.NO_INFO.getCode());
		userDo.setUserType(UserTypeEnum.NORMAL.getCode());
		userDo.setGradeExp(0);
		userDo.setGradeLevel((byte) 0);
		userDo.setPoint(0);
		userDo.setNickname(generateNickname(UserSexEnum.FEMALE));
		userDo.setSex(UserSexEnum.FEMALE.getCode());
		userDo.setCountInform(0);
		userDo.setCountFavor(0);
		userDo.setCountPublish(0);
		userDo.setCountIdol(0);
		userDo.setCountFans(0);
		Long now = DateUtil.nowInMilliseconds();
		userDo.setAddTime(now);
		userDo.setUpdTime(now);
		userDao.insertUser(userDo);

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
		UserDo userDo = userDao.selectUserByUsername(username);
		// 用户不存在
		if (userDo == null) { // 用户名或密码错误
			throw new BusinessException(RespCode.RESP_0112);
		}

		// 用户密码校验和错误次数
		String pwd = encryptPassword(password);
		if (!StringUtils.equals(pwd, userDo.getPassword())) {
			// 更新登录失败次数
			userDao.increaseFailTimesByUserId(userDo.getUserId());
			// 超过指定次数锁定账户 TODO

			throw new BusinessException(RespCode.RESP_0112);
		}
		if (userDo.getFailTimes() > 0) {
			// 清零
			userDao.clearFailTimesByUserId(userDo.getUserId());
		}

		// 用户状态校验
		// UserStatusEnum statusEnum = UserStatusEnum.valueOfCode(userDo.getUserStatus());
		// if (statusEnum == UserStatusEnum.LOCKED) {
		// throw new BusinessException(RespCode.RESP_0114);
		// }
		// if (statusEnum == UserStatusEnum.NON_ACTIVE) {
		// throw new BusinessException(RespCode.RESP_0115);
		// }

		// 登录成功生成新的TOKEN
		TokenBo tokenBo = genTokenForUser(userIp, userDo.getUserId());

		// 作废原有的TOKEN
		// deleteToken(originalToken);

		return tokenBo;
	}

	/**
	 * 登出
	 *
	 * @param userId
	 */
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
		UserDo userDo = userDao.selectUserByUserId(userId);

		if (userDo == null) {
			throw new BusinessException(RespCode.RESP_0110);
		}

		if (!StringUtils.equals(encryptPassword(password), userDo.getPassword())) {
			throw new BusinessException(RespCode.RESP_0113);
		}

		userDao.updatePasswordByUserId(encryptPassword(newPassword), userId);
	}

	/**
	 * 获取用户基本信息
	 *
	 * @param userId
	 * @return
	 */
	public UserBo getUserInfoSimple(Long userId) {
		UserBo userBo = null;

		// 用户信息
		UserDo userDo = userDao.selectUserByUserId(userId);
		if (userDo != null) {
			userBo = new UserBo();
			BeanUtils.copyProperties(userDo, userBo);
			assembleResource(userBo);
		}

		return userBo;
	}

	/**
	 * 获取用户信息
	 *
	 * @param userId
	 * @return
	 */
	public UserBo getUserInfo(Long userId) {
		UserBo userBo = null;

		// 用户信息
		UserDo userDo = userDao.selectUserByUserId(userId);
		if (userDo != null) {
			userBo = new UserBo();
			BeanUtils.copyProperties(userDo, userBo);
			assembleResource(userBo);
			assembleBaby(userBo);
			assembleBindAccount(userBo);
		}

		return userBo;
	}

	protected void assembleResource(UserBo userBo) {
		if (userBo == null) {
			return;
		}
		userBo.setResourceList(resourceService.listResource(EntityTypeEnum.USER.getCode(), userBo.getUserId()));
	}

	protected void assembleBaby(UserBo userBo) {
		if (userBo == null) {
			return;
		}
		List<UserBabyDo> userBabyDoList = userDao.selectUserBabyByUserId(userBo.getUserId());
		List<UserBabyBo> userBabyBoList = new ArrayList<UserBabyBo>(userBabyDoList.size());
		for (UserBabyDo userBabyDo : userBabyDoList) {
			UserBabyBo userBabyBo = new UserBabyBo();
			BeanUtils.copyProperties(userBabyDo, userBabyBo);
			userBabyBoList.add(userBabyBo);
		}
		userBo.setBabyList(userBabyBoList);
	}

	protected void assembleBindAccount(UserBo userBo) {
		if (userBo == null) {
			return;
		}
		List<UserBindAccountDo> userBindAccountDoList = userDao.selectUserBindAccountByUserId(userBo.getUserId());
		List<UserBindAccountBo> userBindAccountBoList = new ArrayList<UserBindAccountBo>(userBindAccountDoList.size());
		for (UserBindAccountDo userBindAccountDo : userBindAccountDoList) {
			UserBindAccountBo userBindAccountBo = new UserBindAccountBo();
			BeanUtils.copyProperties(userBindAccountDo, userBindAccountBo);
			userBindAccountBoList.add(userBindAccountBo);
		}
		userBo.setBindAccountList(userBindAccountBoList);
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
			Long babyBirth, Byte babySex) {
		// 更新用户信息
		UserDo userDo = userDao.selectUserByUserId(userId);

		if (userDo == null) {
			throw new BusinessException(RespCode.RESP_0110);
		}

		Long now = DateUtil.nowInMilliseconds();
		userDo.setNickname(nickname);
		userDo.setSex(sex);
		userDo.setMoodWords(moodWords);
		userDo.setMoodWordsTime(now);
		if (UserStatusEnum.valueOfCode(userDo.getUserStatus()) == UserStatusEnum.NO_INFO) {
			userDo.setUserStatus(UserStatusEnum.NORMAL.getCode());
		}
		userDo.setUpdTime(now);
		userDao.updateByUserId(userDo);

		// 更新用户头像信息
		resourceDao.deleteObjectResourceByEntityTypeAndEntityIdAndForClass(EntityTypeEnum.USER.getCode(), userId,
				ResForClassEnum.HEAD_IMG.getCode());
		if (StringUtils.isNotBlank(headImgRes)) {
			ObjectResourceDo objectResourceDo = new ObjectResourceDo();
			objectResourceDo.setResId(headImgRes);
			objectResourceDo.setEntityType(EntityTypeEnum.USER.getCode());
			objectResourceDo.setEntityId(userId);
			objectResourceDo.setForClass(ResForClassEnum.HEAD_IMG.getCode());
			objectResourceDo.setForSubclass("");
			objectResourceDo.setFinishProcess(BoolEnum.FALSE.getCode());
			objectResourceDo.setAddTime(now);
			objectResourceDo.setUpdTime(now);
			resourceDao.insertObjectResource(objectResourceDo);

			objectResourceDo.setForSubclass("200x200");
			objectResourceDo.setFinishProcess(BoolEnum.FALSE.getCode());
			resourceDao.insertObjectResource(objectResourceDo);
		}

		// 更新用户宝宝信息
		List<UserBabyDo> babyModelList = userDao.selectUserBabyByUserId(userId);
		if (babyModelList.size() > 0) {
			// 更新
			UserBabyDo userBabyDo = babyModelList.get(0);
			userBabyDo.setBabySex(babySex);
			userBabyDo.setBabyBirth(babyBirth);
			userBabyDo.setUpdTime(now);
			userDao.updateUserBaby(userBabyDo);
		} else {
			// 插入
			UserBabyDo userBabyDo = new UserBabyDo();
			userBabyDo.setBabyId(generateBabyId());
			userBabyDo.setUserId(userId);
			userBabyDo.setBabySex(babySex);
			userBabyDo.setBabyBirth(babyBirth);
			userBabyDo.setAddTime(now);
			userBabyDo.setUpdTime(now);
			userDao.insertUserBaby(userBabyDo);
		}

	}

	public SignBo sign(Long userId) {

		SignDo signDo = new SignDo();
		signDo.setSignId(sequenceDao.getSequence(SequenceDao.SEQ_SIGN_ID));
		signDo.setUserId(userId);
		signDo.setPont(10);
		signDo.setAddTime(DateUtil.nowInMilliseconds());

		userDao.insertSign(signDo);

		SignBo signBo = new SignBo();
		BeanUtils.copyProperties(signDo, signBo);
		return signBo;
	}
}
