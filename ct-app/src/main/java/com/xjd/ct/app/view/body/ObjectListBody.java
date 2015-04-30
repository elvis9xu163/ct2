package com.xjd.ct.app.view.body;

import java.util.List;

import com.xjd.ct.app.view.ViewBody;
import com.xjd.ct.app.view.vo.ObjectVo;

/**
 * 
 * @author elvis.xu
 * @since 2015-03-26 22:59
 */
public class ObjectListBody extends ViewBody {
	private List<? extends ObjectVo> objectList;

	public List<? extends ObjectVo> getObjectList() {
		return objectList;
	}

	public void setObjectList(List<? extends ObjectVo> objectList) {
		this.objectList = objectList;
	}
}
