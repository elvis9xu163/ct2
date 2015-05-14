package com.xjd.ct.app.ctrlr.v10;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjd.ct.app.util.BeanTransport;
import com.xjd.ct.app.util.RequestContext;
import com.xjd.ct.app.view.View;
import com.xjd.ct.app.view.ViewUtil;
import com.xjd.ct.app.view.body.ObjectCommentBody;
import com.xjd.ct.app.view.body.ObjectCommentListBody;
import com.xjd.ct.app.view.vo.ObjectCommentVo;
import com.xjd.ct.app.view.vo.UserInfoSimplestVo;
import com.xjd.ct.biz.bo.ObjectCommentBo;
import com.xjd.ct.biz.service.ObjectCommonService;
import com.xjd.ct.utl.valid.ValidationUtil;

/**
 * @author elvis.xu
 * @since 2015-05-01 12:32
 */
@Controller
@RequestMapping("/10")
public class OjectCommonController10 {

	@Autowired
	ObjectCommonService objectCommonService;

	@RequestMapping("/like")
	@ResponseBody
	public View like(@RequestParam(value = "objectId", required = false) String objectId,
			@RequestParam(value = "like", required = false) String like) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.OBJECT_ID, objectId, ValidationUtil.LIKE, like);

		Long objectIdL = Long.valueOf(objectId);
		Byte likeB = Byte.valueOf(like);

		// 业务调用
		objectCommonService.likeYes(RequestContext.checkAndGetUserId(), objectIdL, likeB);

		// 返回结果
		View view = ViewUtil.defaultView();
		return view;
	}

	@RequestMapping("/favor")
	@ResponseBody
	public View favor(@RequestParam(value = "objectId", required = false) String objectId,
			@RequestParam(value = "favor", required = false) String favor) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.OBJECT_ID, objectId, ValidationUtil.FAVOR, favor);

		Long objectIdL = Long.valueOf(objectId);
		Byte favorB = Byte.valueOf(favor);

		// 业务调用
		objectCommonService.favor(RequestContext.checkAndGetUserId(), objectIdL, favorB);

		// 返回结果
		View view = ViewUtil.defaultView();
		return view;
	}

	@RequestMapping("/addComment")
	@ResponseBody
	public View addComment(@RequestParam(value = "objectId", required = false) String objectId,
			@RequestParam(value = "comment", required = false) String comment,
			@RequestParam(value = "toCommentId", required = false) String toCommentId) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.OBJECT_ID, objectId, ValidationUtil.COMMENT, comment);

		if (StringUtils.isNotEmpty(toCommentId)) {
			ValidationUtil.check(ValidationUtil.TO_COMMENT_ID, toCommentId);
		}

		Long objectIdL = Long.valueOf(objectId);
		Long toCommentIdL = null;
		if (StringUtils.isNotEmpty(toCommentId)) {
			toCommentIdL = Long.valueOf(toCommentId);
		}

		// 业务调用
		ObjectCommentBo objectCommentBo = objectCommonService.addComment(RequestContext.checkAndGetUserId(), objectIdL,
				comment, toCommentIdL);

		// 返回结果
		View view = ViewUtil.defaultView();

		if (objectCommentBo != null) {
			ObjectCommentVo vo = new ObjectCommentVo();
			BeanUtils.copyProperties(objectCommentBo, vo);

			ObjectCommentBody body = new ObjectCommentBody();
			body.setComment(vo);

			view.setBody(body);
		}

		return view;
	}

	@RequestMapping("/removeComment")
	@ResponseBody
	public View removeComment(@RequestParam(value = "commentId", required = false) String commentId) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.COMMENT_ID, commentId);

		Long commentIdL = Long.valueOf(commentId);

		// 业务调用
		objectCommonService.removeComment(RequestContext.checkAndGetUserId(), commentIdL);

		// 返回结果
		View view = ViewUtil.defaultView();
		return view;
	}

	@RequestMapping("/listComments")
	@ResponseBody
	public View listComments(@RequestParam(value = "objectId", required = false) String objectId) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.OBJECT_ID, objectId);

		Long objectIdL = Long.valueOf(objectId);

		// 业务调用
		List<ObjectCommentBo> objectCommentBoList = objectCommonService.listComments(objectIdL);

		// 返回结果
		List<ObjectCommentVo> objectCommentVoList = new ArrayList<ObjectCommentVo>(objectCommentBoList.size());
		for (ObjectCommentBo bo : objectCommentBoList) {
			ObjectCommentVo vo = new ObjectCommentVo();
			BeanUtils.copyProperties(bo, vo);
			if (bo.getUser() != null) {
				UserInfoSimplestVo userInfoSimplest = new UserInfoSimplestVo();
				BeanTransport.copyTo(bo.getUser(), userInfoSimplest);
				vo.setUser(userInfoSimplest);
			}
			objectCommentVoList.add(vo);
		}

		ObjectCommentListBody body = new ObjectCommentListBody();
		body.setCommentList(objectCommentVoList);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}
}
