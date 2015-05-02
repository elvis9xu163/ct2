package com.xjd.ct.app.view.body;

import java.util.List;

import com.xjd.ct.app.view.ViewBody;
import com.xjd.ct.app.view.vo.ObjectVo;

/**
 * @author elvis.xu
 * @since 2015-05-01 11:55
 */
public class ObjectListBody extends ViewBody {
	private List<ObjectVo> objectList;

	public List<ObjectVo> getObjectList() {
		return objectList;
	}

	public void setObjectList(List<ObjectVo> objectList) {
		this.objectList = objectList;
	}
}
