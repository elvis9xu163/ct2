package com.xjd.ct.app.view.body;

import java.util.List;

import com.xjd.ct.app.view.ViewBody;
import com.xjd.ct.app.view.vo.MsgInformVo;

/**
 * @author elvis.xu
 * @since 2015-05-01 11:15
 */
public class MsgInformListBody extends ViewBody {
	private List<MsgInformVo> msgInformList;

	public List<MsgInformVo> getMsgInformList() {
		return msgInformList;
	}

	public void setMsgInformList(List<MsgInformVo> msgInformList) {
		this.msgInformList = msgInformList;
	}
}
