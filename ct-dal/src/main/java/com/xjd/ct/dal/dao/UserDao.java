package com.xjd.ct.dal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.*;
import com.xjd.ct.dal.map.SignDoMapper;
import com.xjd.ct.dal.map.UserBabyDoMapper;
import com.xjd.ct.dal.map.UserBindAccountDoMapper;
import com.xjd.ct.dal.map.UserDoMapper;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.QueryResultUtil;

/**
 * 用户数据Dao
 * 
 * @author elvis.xu
 * @since 2015-3-19 下午7:15:19
 */
@Repository
@Transactional
public class UserDao {

	@Autowired
	UserDoMapper userDoMapper;
	@Autowired
	UserBabyDoMapper userBabyDoMapper;
	@Autowired
	UserBindAccountDoMapper userBindAccountDoMapper;
	@Autowired
	SignDoMapper signDoMapper;

	// ==============用户基本信息=============== //

	/**
	 * 通过UserId查询用户基本数据
	 * 
	 * @param userId
	 * @return
	 */
	public UserDo selectUserByUserId(Long userId) {
		return userDoMapper.selectByPrimaryKey(userId);
	}

	/**
	 * 根据用户名(手机号或邮箱)查询用户的基本信息(授权信息)
	 * 
	 * @param username
	 * @return
	 */
	public UserDo selectUserByUsername(String username) {
		UserDoExample example = new UserDoExample();
		example.or().andMobileEqualTo(username);
		example.or().andEmailEqualTo(username);

		List<UserDo> list = userDoMapper.selectByExample(example);
		QueryResultUtil.assertMaxOne(list, username);

		return list.size() > 0 ? list.get(0) : null;
	}

	/**
	 * 根据用户名(手机或邮箱)和密码查找用户的ID
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public Long selectUserIdByUsernameAndPassword(String username, String password) {
		UserDoExample example = new UserDoExample();
		example.or().andMobileEqualTo(username).andPasswordEqualTo(password);
		example.or().andEmailEqualTo(username).andPasswordEqualTo(password);

		List<UserDo> list = userDoMapper.selectByExample(example);
		QueryResultUtil.assertMaxOne(list, username, password);

		return list.size() > 0 ? list.get(0).getUserId() : null;
	}

	/**
	 * 通过用户ID更新密码
	 * 
	 * @param password
	 * @param userId
	 * @return
	 */
	public int updatePasswordByUserId(String password, Long userId) {
		UserDo userModel = new UserDo();
		userModel.setPassword(password);
		userModel.setUserId(userId);
		userModel.setUpdTime(DateUtil.nowInMilliseconds());
		return userDoMapper.updateByPrimaryKeySelective(userModel);
	}

	/**
	 * 检查手机号或邮箱是否存在
	 * 
	 * @param mobileOrEmail
	 * @return
	 */
	public boolean isMobileOrEmailExists(String mobileOrEmail) {
		UserDoExample example = new UserDoExample();
		example.or().andMobileEqualTo(mobileOrEmail);
		example.or().andEmailEqualTo(mobileOrEmail);

		return userDoMapper.countByExample(example) > 0 ? true : false;
	}

	/**
	 * 插入一个用户基本信息
	 * 
	 * @param userDo
	 */
	public int insertUser(UserDo userDo) {
		return userDoMapper.insert(userDo);
	}

	/**
	 * 用户FailTimes加1
	 * 
	 * @param userId
	 * @return
	 */
	public int increaseFailTimesByUserId(Long userId) {
		UserDo userModel = userDoMapper.selectByPrimaryKey(userId);

		UserDo upd = new UserDo();
		upd.setUserId(userId);
		upd.setFailTimes((short) (userModel.getFailTimes() + 1));
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return userDoMapper.updateByPrimaryKeySelective(upd);
	}

	/**
	 * 清0用户的FailTImes
	 * 
	 * @param userId
	 * @return
	 */
	public int clearFailTimesByUserId(Long userId) {
		UserDo upd = new UserDo();
		upd.setUserId(userId);
		upd.setFailTimes((short) 0);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return userDoMapper.updateByPrimaryKeySelective(upd);
	}

	public int updateUserStatusByUserId(byte userStatus, Long userId) {
		UserDo upd = new UserDo();
		upd.setUserId(userId);
		upd.setUserStatus(userStatus);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return userDoMapper.updateByPrimaryKeySelective(upd);

	}

	public List<UserBabyDo> selectUserBabyByUserId(Long userId) {
		UserBabyDoExample example = new UserBabyDoExample();
		example.or().andUserIdEqualTo(userId);

		return userBabyDoMapper.selectByExample(example);
	}

	public List<UserBindAccountDo> selectUserBindAccountByUserId(Long userId) {
		UserBindAccountDoExample example = new UserBindAccountDoExample();
		example.or().andUserIdEqualTo(userId);

		return userBindAccountDoMapper.selectByExample(example);
	}

	public int updateByUserId(UserDo userDo) {
		return userDoMapper.updateByPrimaryKey(userDo);
	}

	public int updateUserBaby(UserBabyDo userBabyDo) {
		return userBabyDoMapper.updateByPrimaryKey(userBabyDo);
	}

	public int insertUserBaby(UserBabyDo userBabyDo) {
		return userBabyDoMapper.insert(userBabyDo);
	}

	/**
	 * 用户关注记数加1
	 *
	 * @param userId
	 * @return
	 */
	public int increaseIdolCountByUserId(Long userId) {
		UserDo userDo = userDoMapper.selectByPrimaryKey(userId);

		UserDo upd = new UserDo();
		upd.setUserId(userId);
		upd.setCountIdol(userDo.getCountIdol() + 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return userDoMapper.updateByPrimaryKeySelective(upd);
	}

	/**
	 * 用户粉丝记数加1
	 *
	 * @param userId
	 * @return
	 */
	public int increaseFansCountByUserId(Long userId) {
		UserDo userDo = userDoMapper.selectByPrimaryKey(userId);

		UserDo upd = new UserDo();
		upd.setUserId(userId);
		upd.setCountFans(userDo.getCountFans() + 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return userDoMapper.updateByPrimaryKeySelective(upd);
	}

	/**
	 * 用户关注记数减1
	 *
	 * @param userId
	 * @return
	 */
	public int decreaseIdolCountByUserId(Long userId) {
		UserDo userDo = userDoMapper.selectByPrimaryKey(userId);

		UserDo upd = new UserDo();
		upd.setUserId(userId);
		upd.setCountIdol(userDo.getCountIdol() - 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return userDoMapper.updateByPrimaryKeySelective(upd);
	}

	/**
	 * 用户粉丝记数减1
	 *
	 * @param userId
	 * @return
	 */
	public int decreaseFansCountByUserId(Long userId) {
		UserDo userDo = userDoMapper.selectByPrimaryKey(userId);

		UserDo upd = new UserDo();
		upd.setUserId(userId);
		upd.setCountFans(userDo.getCountFans() - 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return userDoMapper.updateByPrimaryKeySelective(upd);
	}

	public int increaseFavorCount(Long userId) {
		UserDo userDo = userDoMapper.selectByPrimaryKey(userId);

		UserDo upd = new UserDo();
		upd.setUserId(userId);
		upd.setCountFavor(userDo.getCountFavor() + 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return userDoMapper.updateByPrimaryKeySelective(upd);

	}

	public int decreaseFavorCount(Long userId) {
		UserDo userDo = userDoMapper.selectByPrimaryKey(userId);

		UserDo upd = new UserDo();
		upd.setUserId(userId);
		upd.setCountFavor(userDo.getCountFavor() - 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return userDoMapper.updateByPrimaryKeySelective(upd);
	}

	public int increasePublishCount(Long userId) {
		UserDo userDo = userDoMapper.selectByPrimaryKey(userId);

		UserDo upd = new UserDo();
		upd.setUserId(userId);
		upd.setCountPublish(userDo.getCountPublish() + 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return userDoMapper.updateByPrimaryKeySelective(upd);

	}

	public int decreasePublishCount(Long userId) {
		UserDo userDo = userDoMapper.selectByPrimaryKey(userId);

		UserDo upd = new UserDo();
		upd.setUserId(userId);
		upd.setCountPublish(userDo.getCountPublish() - 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return userDoMapper.updateByPrimaryKeySelective(upd);
	}

	public int increaseLikeYesCount(Long userId) {
		UserDo userDo = userDoMapper.selectByPrimaryKey(userId);

		UserDo upd = new UserDo();
		upd.setUserId(userId);
		upd.setCountLikeYes(userDo.getCountLikeYes() + 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return userDoMapper.updateByPrimaryKeySelective(upd);

	}

	public int decreaseLikeYesCount(Long userId) {
		UserDo userDo = userDoMapper.selectByPrimaryKey(userId);

		UserDo upd = new UserDo();
		upd.setUserId(userId);
		upd.setCountLikeYes(userDo.getCountLikeYes() - 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return userDoMapper.updateByPrimaryKeySelective(upd);
	}

	public int increaseLikeNoCount(Long userId) {
		UserDo userDo = userDoMapper.selectByPrimaryKey(userId);

		UserDo upd = new UserDo();
		upd.setUserId(userId);
		upd.setCountLikeNo(userDo.getCountLikeNo() + 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return userDoMapper.updateByPrimaryKeySelective(upd);

	}

	public int decreaseLikeNoCount(Long userId) {
		UserDo userDo = userDoMapper.selectByPrimaryKey(userId);

		UserDo upd = new UserDo();
		upd.setUserId(userId);
		upd.setCountLikeNo(userDo.getCountLikeNo() - 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return userDoMapper.updateByPrimaryKeySelective(upd);
	}

	public int insertSign(SignDo signDo) {
		return signDoMapper.insert(signDo);
	}
}
