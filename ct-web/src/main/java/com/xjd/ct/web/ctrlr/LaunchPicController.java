package com.xjd.ct.web.ctrlr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author elvis.xu
 * @since 2015-06-06 11:51
 */
@Controller
@RequestMapping("/admin/launchpic")
public class LaunchPicController {

	@RequestMapping("/input")
	public String input() {
		return "admin/launchpic_set";
	}

	@RequestMapping("/set")
	public String set() {
		return "admin/success";
	}
}
