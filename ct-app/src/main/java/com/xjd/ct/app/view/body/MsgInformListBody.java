package com.xjd.ct.app.view.body;

import java.util.List;

import com.xjd.ct.app.view.ViewBody;
import com.xjd.ct.app.view.vo.MsgInformVo;

/**
 * @author elvis.xu
 * @since 2015-03-26 21:39
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
