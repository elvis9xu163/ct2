package com.xjd.ct.web.view;

import com.xjd.ct.biz.bo.ResourceBo;

/**
 * @author elvis.xu
 * @since 2015-05-02 22:40
 */
public class ResourceBody extends ViewBody {
	private ResourceBo resource;

	public ResourceBo getResource() {
		return resource;
	}

	public void setResource(ResourceBo resource) {
		this.resource = resource;
	}
}
