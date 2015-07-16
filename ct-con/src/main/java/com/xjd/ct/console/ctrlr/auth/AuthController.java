package com.xjd.ct.console.ctrlr.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/auth")
@Controller
public class AuthController {

	@RequestMapping("/input")
	public String input() {
		return "auth/input";
	}
	
	@RequestMapping("/login")
	public String login() {
		return null;
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return null;
	}
}
