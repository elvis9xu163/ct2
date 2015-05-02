package com.xjd.ct.app.view.body;

import java.util.List;

import com.xjd.ct.app.view.ViewBody;
import com.xjd.ct.app.view.vo.ObjectCommentVo;

/**
 * @author elvis.xu
 * @since 2015-05-01 14:36
 */
public class ObjectCommentListBody extends ViewBody {
	private List<ObjectCommentVo> commentList;

	public List<ObjectCommentVo> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<ObjectCommentVo> commentList) {
		this.commentList = commentList;
	}
}
