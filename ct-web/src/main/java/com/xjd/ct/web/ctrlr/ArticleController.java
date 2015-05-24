package com.xjd.ct.web.ctrlr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author elvis.xu
 * @since 2015-05-26 22:02
 */
@Controller
@RequestMapping("/admin/article")
public class ArticleController {

	@RequestMapping("/edit/input")
	public String articleEditInput() {
		return "article_edit";
	}


}
