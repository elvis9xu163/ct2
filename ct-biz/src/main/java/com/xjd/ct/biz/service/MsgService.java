package com.xjd.ct.biz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.biz.bo.MsgInformBo;
import com.xjd.ct.dal.dao.MsgDao;
import com.xjd.ct.dal.dos.MsgInformDo;

/**
 * 消息服务
 * 
 * @author elvis.xu
 * @since 2015-4-30 下午6:01:00
 */
@Service
public class MsgService {
	@Autowired
	MsgDao msgDao;

	@Transactional(readOnly = true)
	public List<MsgInformBo> listMsgs(Long userId, long offset, int limit) {
		List<MsgInformDo> msgInformDoList = msgDao.selectMsgInformByUserIdAndPage(userId, offset, limit);

		List<MsgInformBo> msgInformBoList = new ArrayList<MsgInformBo>(msgInformDoList.size());
		for (MsgInformDo msgInformDo : msgInformDoList) {
			MsgInformBo msgInformBo = new MsgInformBo();
			BeanUtils.copyProperties(msgInformDo, msgInformBo);
			msgInformBoList.add(msgInformBo);
		}

		return msgInformBoList;
	}
}
