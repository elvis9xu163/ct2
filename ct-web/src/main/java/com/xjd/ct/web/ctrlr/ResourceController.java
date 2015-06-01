package com.xjd.ct.web.ctrlr;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.web.ctrlr.v10.ResourceController10;
import com.xjd.ct.web.util.SessionContextUtil;
import com.xjd.ct.web.view.View;

/**
 * @author elvis.xu
 * @since 2015-05-26 23:31
 */
@Controller
public class ResourceController {
	@Autowired
	ResourceController10 resourceController10;

	@RequestMapping("/admin/resource/uploadArticleImg")
	public String uploadArticleImg(@RequestParam(value = "file", required = false) MultipartFile multipartFile,
			HttpServletRequest request, Map map) {

		View view = resourceController10.upload(DateUtil.nowInMilliseconds() + "", SessionContextUtil.getToken().getToken(), null,
				multipartFile, request);

		map.put("appView", view);
		return "admin/article_img_result";
	}

}
