package com.xjd.ct.dal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.*;
import com.xjd.ct.dal.map.AppVersionDoMapper;
import com.xjd.ct.dal.map.ServiceDoMapper;
import com.xjd.ct.dal.map.ServiceLogDoMapper;
import com.xjd.ct.utl.enums.BoolEnum;

/**
 * 接口数据Dao
 * 
 * @author elvis.xu
 * @since 2015-03-20 14:52
 */
@Repository
@Transactional
public class ServiceDao {
	@Autowired
	SequenceDao sequenceDao;
	@Autowired
	ServiceDoMapper serviceDoMapper;
	@Autowired
	ServiceLogDoMapper serviceLogDoMapper;
	@Autowired
	AppVersionDoMapper appVersionDoMapper;

	/**
	 * 根据Name和Version查询接口信息
	 * 
	 * @param name
	 * @param version
	 * @return
	 */
	public ServiceDo selectByNameAndVersion(String name, String version) {
		ServiceDoKey key = new ServiceDoKey();
		key.setServiceName(name);
		key.setServiceVersion(version);

		return serviceDoMapper.selectByPrimaryKey(key);
	}

	/**
	 * 插入一条接口调用日志
	 * 
	 * @param userIp
	 * @param userId
	 * @param token
	 * @param serviceName
	 * @param serviceVersion
	 * @param requestTimestamp
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public int serviceLog(String userIp, Long userId, String token, String serviceName, String serviceVersion,
			Long requestTimestamp) {
		ServiceLogDo serviceLogDo = new ServiceLogDo();
		serviceLogDo.setLogId(sequenceDao.getSequence(SequenceDao.SEQ_SERVICE_LOG_ID));
		serviceLogDo.setUserIp(userIp);
		serviceLogDo.setUserId(userId);
		serviceLogDo.setToken(token);
		serviceLogDo.setServiceName(serviceName);
		serviceLogDo.setServiceVersion(serviceVersion);
		serviceLogDo.setRequestTime(requestTimestamp);

		return serviceLogDoMapper.insert(serviceLogDo);
	}

	public AppVersionDo selectAppVersionByAppTypeAndVerCode(Byte appType, Short verCode) {
		AppVersionDoKey key = new AppVersionDo();
		key.setAppType(appType);
		key.setVerCode(verCode);
		return appVersionDoMapper.selectByPrimaryKey(key);
	}

	public AppVersionDo selectAvailableLatestAppVersionOfAppType(Byte appType) {
		AppVersionDoExample example = new AppVersionDoExample();
		example.or().andAppTypeEqualTo(appType).andSupportFlagEqualTo(BoolEnum.TRUE.getCode());
		example.setOrderByClause("VER_CODE DESC");
		example.setOffsetAndLimit(0, 1);

		List<AppVersionDo> list = appVersionDoMapper.selectByExample(example);

		return list.isEmpty() ? null : list.get(0);
	}
}
