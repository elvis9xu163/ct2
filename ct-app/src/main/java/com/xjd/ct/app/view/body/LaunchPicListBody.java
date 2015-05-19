package com.xjd.ct.app.view.body;

import java.util.List;

import com.xjd.ct.app.view.ViewBody;
import com.xjd.ct.app.view.vo.LaunchPicVo;

/**
 * @author elvis.xu
 * @since 2015-05-01 15:11
 */
public class LaunchPicListBody extends ViewBody {
	private List<LaunchPicVo> launchPicList;

	public List<LaunchPicVo> getLaunchPicList() {
		return launchPicList;
	}

	public void setLaunchPicList(List<LaunchPicVo> launchPicList) {
		this.launchPicList = launchPicList;
	}
}
