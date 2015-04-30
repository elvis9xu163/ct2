package com.xjd.ct.app.view.body;

import java.util.List;

import com.xjd.ct.app.view.ViewBody;
import com.xjd.ct.app.view.vo.CommentVo;

/**
 * @author elvis.xu
 * @since 2015-03-30 21:02
 */
public class CommentListBody extends ViewBody {
	private List<CommentVo> commentList;

	public List<CommentVo> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<CommentVo> commentList) {
		this.commentList = commentList;
	}
}
