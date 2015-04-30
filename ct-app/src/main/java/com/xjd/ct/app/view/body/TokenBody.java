package com.xjd.ct.app.view.body;

import com.xjd.ct.app.view.ViewBody;

/**
 * @author elvis.xu
 * @since 2015-02-25 14:48
 */
public class TokenBody extends ViewBody {
	private String token;
	private String salt;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
}
