package com.xjd.ct.app.view.body;

import com.xjd.ct.app.view.ViewBody;
import com.xjd.ct.app.view.vo.AppVersionResultVo;

/**
 * @author elvis.xu
 * @since 2015-05-12 13:52
 */
public class AppVersionResultBody extends ViewBody {
	private AppVersionResultVo appVersion;

	public AppVersionResultVo getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(AppVersionResultVo appVersion) {
		this.appVersion = appVersion;
	}
}
