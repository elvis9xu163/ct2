package com.xjd.ct.app.ctrlr.v10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjd.ct.app.biz.IndexPageBiz;
import com.xjd.ct.app.util.RequestContext;
import com.xjd.ct.app.view.View;
import com.xjd.ct.app.view.ViewUtil;
import com.xjd.ct.app.view.body.BannerListBody;
import com.xjd.ct.app.view.body.ObjectListBody;
import com.xjd.ct.app.view.body.ResourceBody;
import com.xjd.ct.app.view.vo.BannerVo;
import com.xjd.ct.app.view.vo.ObjectVo;
import com.xjd.ct.app.view.vo.ResourceVo;
import com.xjd.ct.utl.valid.ValidationUtil;

/**
 * 首页控制器
 * 
 * @author elvis.xu
 * @since 2015-03-26 21:40
 */
@Controller
@RequestMapping("/10")
public class IndexPageController10 {
	@Autowired
	IndexPageBiz indexPageBiz;

	@RequestMapping("/getLaunchPic")
	@ResponseBody
	public View getLaunchPic() {
		// 业务调用
		ResourceVo resourceVo = indexPageBiz.getLaunchPic();

		// 返回结果
		ResourceBody body = new ResourceBody();
		body.setResource(resourceVo);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

	@RequestMapping("/listBanners")
	@ResponseBody
	public View listBanners() {
		// 业务调用
		List<BannerVo> list = indexPageBiz.listBanners();

		// 返回结果
		BannerListBody body = new BannerListBody();
		body.setBannerList(list);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

	@RequestMapping("/listRecommendObjects")
	@ResponseBody
	public View listRecommendObjects() {
		// 业务调用
		List<ObjectVo> list = indexPageBiz.listRecommendObjects();

		// 返回结果
		ObjectListBody body = new ObjectListBody();
		body.setObjectList(list);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

	@RequestMapping("/listObjectsOfSubscription")
	@ResponseBody
	public View listObjectsOfSubscription(@RequestParam(value = "subscribeId", required = false) String subscribeId,
			@RequestParam(value = "orderBy", required = false) String orderBy,
			@RequestParam(value = "offset", required = false) String offset,
			@RequestParam(value = "count", required = false) String count) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.SUBSCRIBE_ID, subscribeId, ValidationUtil.ORDER_BY, orderBy,
				ValidationUtil.OFFSET, offset, ValidationUtil.COUNT, count);

		Long subscribeIdL = Long.valueOf(subscribeId);
		Byte orderByB = Byte.valueOf(orderBy);
		Long offsetL = Long.valueOf(offset);
		Integer countI = Integer.valueOf(count);

		// 业务调用
		List<ObjectVo> list = indexPageBiz.listObjectsOfSubscription(RequestContext.getUserId(), subscribeIdL,
				orderByB, offsetL, countI);

		// 返回结果
		ObjectListBody body = new ObjectListBody();
		body.setObjectList(list);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}
}
