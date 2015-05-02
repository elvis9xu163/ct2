package com.xjd.ct.app.view.body;

import java.util.List;

import com.xjd.ct.app.view.ViewBody;
import com.xjd.ct.app.view.vo.SubscribeVo;

/**
 * @author elvis.xu
 * @since 2015-05-01 15:05
 */
public class SubscribeListBody extends ViewBody {
	private List<SubscribeVo> subscribeList;

	public List<SubscribeVo> getSubscribeList() {
		return subscribeList;
	}

	public void setSubscribeList(List<SubscribeVo> subscribeList) {
		this.subscribeList = subscribeList;
	}
}
