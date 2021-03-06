package com.xjd.ct.biz.service;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.biz.bo.AppVersionResultBo;
import com.xjd.ct.biz.bo.ServiceBo;
import com.xjd.ct.dal.dao.SequenceDao;
import com.xjd.ct.dal.dao.ServiceDao;
import com.xjd.ct.dal.dos.AppVersionDo;
import com.xjd.ct.dal.dos.FeedbackDo;
import com.xjd.ct.dal.dos.ReportDo;
import com.xjd.ct.dal.dos.ServiceDo;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.enums.BoolEnum;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

/**
 * APP后端网关相关服务
 * 
 * @author elvis.xu
 * @since 2015-4-30 下午5:57:59
 */
@Service
public class GatewayService {
	@Autowired
	ServiceDao serviceDao;
	@Autowired
	SequenceDao sequenceDao;

	/**
	 * 根据name和version查询Service配置
	 * 
	 * @param serviceName
	 * @param serviceVersion
	 * @return
	 */
	@Transactional(readOnly = true)
	public ServiceBo queryServiceByNameAndVersion(String serviceName, String serviceVersion) {
		ServiceDo serviceDo = serviceDao.selectByNameAndVersion(serviceName, serviceVersion);
		ServiceBo serviceBo = null;
		if (serviceDo != null) {
			serviceBo = new ServiceBo();
			BeanUtils.copyProperties(serviceDo, serviceBo);
		}

		return serviceBo;
	}

	/**
	 * 服务请求日志记录
	 * 
	 * @param userIp
	 * @param userId
	 * @param token
	 * @param serviceName
	 * @param serviceVersion
	 * @param requestTimestamp
	 */
	public void serviceLog(String userIp, Long userId, String token, String serviceName, String serviceVersion,
			Date requestTimestamp) {
		serviceDao.serviceLog(userIp, userId, token, serviceName, serviceVersion, requestTimestamp.getTime());
	}

	/**
	 * 检查版本更新
	 * 
	 * @param appType
	 * @param verCode
	 * @return
	 */
	public AppVersionResultBo checkAppVersion(Byte appType, Short verCode) {
		AppVersionResultBo appVersionResultBo = new AppVersionResultBo();

		// 需要强制更新
		AppVersionDo appVersionDo = serviceDao.selectAppVersionByAppTypeAndVerCode(appType, verCode);
		if (appVersionDo == null || BoolEnum.valueOfCode(appVersionDo.getSupportFlag()) == BoolEnum.FALSE) {
			appVersionResultBo.setMandatory(BoolEnum.TRUE.getCode());
		} else {
			appVersionResultBo.setMandatory(BoolEnum.FALSE.getCode());
		}

		// 获取最新版本
		AppVersionDo latestDo = serviceDao.selectAvailableLatestAppVersionOfAppType(appType);
		if (latestDo == null) {
			throw new BusinessException(RespCode.RESP_9970);
		}

		if (BoolEnum.valueOfCode(appVersionResultBo.getMandatory()) == BoolEnum.TRUE
				|| (BoolEnum.valueOfCode(appVersionResultBo.getMandatory()) == BoolEnum.FALSE && latestDo.getVerCode() > verCode)) {
			BeanUtils.copyProperties(latestDo, appVersionResultBo);
		} else {
			return null;
		}
		return appVersionResultBo;
	}

	public void feedback(Long userId, String feedbackContent) {
		Long nowInMilliseconds = DateUtil.nowInMilliseconds();

		FeedbackDo feedbackDo = new FeedbackDo();
		feedbackDo.setFeedbackId(sequenceDao.getSequence(SequenceDao.SEQ_FEEDBACK_ID));
		feedbackDo.setUserId(userId);
		feedbackDo.setFeedbackContent(feedbackContent);
		feedbackDo.setAddTime(nowInMilliseconds);
		feedbackDo.setUpdTime(nowInMilliseconds);

		serviceDao.insertFeedback(feedbackDo);
	}

	public void report(Long userId, Byte refType, Long refId, Byte reasonType, String reasonDetail) {
		Long nowInMilliseconds = DateUtil.nowInMilliseconds();

		ReportDo reportDo = new ReportDo();
		reportDo.setReportId(sequenceDao.getSequence(SequenceDao.SEQ_REPORT_ID));
		reportDo.setUserId(userId);
		reportDo.setRefType(refType);
		reportDo.setRefId(refId);
		reportDo.setReportReasonType(reasonType);
		reportDo.setReportReasonDetail(reasonDetail);
		reportDo.setAddTime(nowInMilliseconds);
		reportDo.setUpdTime(nowInMilliseconds);
		serviceDao.insertReport(reportDo);
	}
}
