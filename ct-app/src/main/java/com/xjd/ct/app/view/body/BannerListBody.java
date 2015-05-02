package com.xjd.ct.app.view.body;

import java.util.List;

import com.xjd.ct.app.view.ViewBody;
import com.xjd.ct.app.view.vo.BannerVo;

/**
 * @author elvis.xu
 * @since 2015-05-02 12:08
 */
public class BannerListBody extends ViewBody {
	private List<BannerVo> bannerList;

	public List<BannerVo> getBannerList() {
		return bannerList;
	}

	public void setBannerList(List<BannerVo> bannerList) {
		this.bannerList = bannerList;
	}
}
