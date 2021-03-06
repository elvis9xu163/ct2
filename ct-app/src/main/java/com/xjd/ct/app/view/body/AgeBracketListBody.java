package com.xjd.ct.app.view.body;

import java.util.List;

import com.xjd.ct.app.view.ViewBody;
import com.xjd.ct.app.view.vo.AgeBracketVo;

/**
 * @author elvis.xu
 * @since 2015-05-01 15:11
 */
public class AgeBracketListBody extends ViewBody {
	private List<AgeBracketVo> ageBracketList;

	public List<AgeBracketVo> getAgeBracketList() {
		return ageBracketList;
	}

	public void setAgeBracketList(List<AgeBracketVo> ageBracketList) {
		this.ageBracketList = ageBracketList;
	}
}
