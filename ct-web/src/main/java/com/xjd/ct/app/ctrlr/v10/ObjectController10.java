package com.xjd.ct.app.ctrlr.v10;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjd.ct.app.biz.ObjectBiz;
import com.xjd.ct.app.util.RequestContext;
import com.xjd.ct.app.view.View;
import com.xjd.ct.app.view.ViewUtil;
import com.xjd.ct.app.view.body.CommentBody;
import com.xjd.ct.app.view.body.CommentListBody;
import com.xjd.ct.app.view.body.ObjectListBody;
import com.xjd.ct.app.view.vo.CommentVo;
import com.xjd.ct.app.view.vo.ObjectVo;
import com.xjd.ct.app.view.vo.PublishVo;
import com.xjd.ct.biz.service.BizObjectService;
import com.xjd.ct.biz.service.PublishService;
import com.xjd.ct.utl.enums.YesNoEnum;
import com.xjd.ct.utl.valid.ValidationUtil;

/**
 * 收藏控制器
 * 
 * @author elvis.xu
 * @since 2015-03-26 21:40
 */
@Controller
@RequestMapping("/10")
public class ObjectController10 {
	@Autowired
	ObjectBiz objectBiz;
	@Autowired
	BizObjectService bizObjectService;
	@Autowired
	PublishService publishService;

	@RequestMapping("/listMyPublishs")
	@ResponseBody
	public View listMyPublishs(@RequestParam(value = "offset", required = false) String offset,
			@RequestParam(value = "count", required = false) String count) {
		// 参数校验
		if (StringUtils.isNotEmpty(offset)) {
			ValidationUtil.check(ValidationUtil.OFFSET, offset);
		}
		if (StringUtils.isNotEmpty(count)) {
			ValidationUtil.check(ValidationUtil.COUNT, count);
		}

		long offsetI = 1;
		int countI = 20;

		if (StringUtils.isNotEmpty(offset)) {
			offsetI = Long.parseLong(offset);
			if (offsetI < 1) {
				offsetI = 1;
			}
		}

		if (StringUtils.isNotEmpty(count)) {
			countI = Integer.parseInt(count);
			if (countI < 1) {
				countI = 1;
			} else if (countI > 100) {
				countI = 100;
			}
		}

		// 业务调用
		List<PublishVo> publishVoList = objectBiz.listPublishs(RequestContext.checkAndGetUserId(), offsetI, countI);

		// 返回结果
		ObjectListBody body = new ObjectListBody();
		body.setObjectList(publishVoList);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

	@RequestMapping("/listMyFavors")
	@ResponseBody
	public View listMyFavors(@RequestParam(value = "offset", required = false) String offset,
			@RequestParam(value = "count", required = false) String count) {
		// 参数校验
		if (StringUtils.isNotEmpty(offset)) {
			ValidationUtil.check(ValidationUtil.OFFSET, offset);
		}
		if (StringUtils.isNotEmpty(count)) {
			ValidationUtil.check(ValidationUtil.COUNT, count);
		}

		long offsetI = 1;
		int countI = 20;

		if (StringUtils.isNotEmpty(offset)) {
			offsetI = Long.parseLong(offset);
			if (offsetI < 1) {
				offsetI = 1;
			}
		}

		if (StringUtils.isNotEmpty(count)) {
			countI = Integer.parseInt(count);
			if (countI < 1) {
				countI = 1;
			} else if (countI > 100) {
				countI = 100;
			}
		}

		// 业务调用
		List<ObjectVo> objectVoList = objectBiz.listFavors(RequestContext.checkAndGetUserId(), offsetI, countI);

		// 返回结果
		ObjectListBody body = new ObjectListBody();
		body.setObjectList(objectVoList);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

	@RequestMapping("/listMyLikes")
	@ResponseBody
	public View listMyLikes(@RequestParam(value = "offset", required = false) String offset,
			@RequestParam(value = "count", required = false) String count) {
		// 参数校验
		if (StringUtils.isNotEmpty(offset)) {
			ValidationUtil.check(ValidationUtil.OFFSET, offset);
		}
		if (StringUtils.isNotEmpty(count)) {
			ValidationUtil.check(ValidationUtil.COUNT, count);
		}

		long offsetI = 1;
		int countI = 20;

		if (StringUtils.isNotEmpty(offset)) {
			offsetI = Long.parseLong(offset);
			if (offsetI < 1) {
				offsetI = 1;
			}
		}

		if (StringUtils.isNotEmpty(count)) {
			countI = Integer.parseInt(count);
			if (countI < 1) {
				countI = 1;
			} else if (countI > 100) {
				countI = 100;
			}
		}

		// 业务调用
		List<ObjectVo> objectVoList = objectBiz.listLikes(RequestContext.checkAndGetUserId(), offsetI, countI);

		// 返回结果
		ObjectListBody body = new ObjectListBody();
		body.setObjectList(objectVoList);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

	@RequestMapping("/like")
	@ResponseBody
	public View like(@RequestParam(value = "objectType", required = false) String objectType,
			@RequestParam(value = "objectRefId", required = false) String objectRefId,
			@RequestParam(value = "like", required = false) String like) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.OBJECT_TYPE, objectType, ValidationUtil.OBJECT_REF_ID, objectRefId,
				ValidationUtil.LIKE, like);

		Byte objectTypeB = Byte.valueOf(objectType);
		Long objectRefIdL = Long.valueOf(objectRefId);

		// 业务调用
		if ("1".equals(like)) {
			bizObjectService.addLike(RequestContext.checkAndGetUserId(), objectTypeB, objectRefIdL, YesNoEnum.YES.getCode());
		} else {
			bizObjectService.removeLike(RequestContext.checkAndGetUserId(), objectTypeB, objectRefIdL, YesNoEnum.YES.getCode());
		}
		// 返回结果
		View view = ViewUtil.defaultView();
		return view;
	}
	
	@RequestMapping("/favor")
	@ResponseBody
	public View favor(@RequestParam(value = "objectType", required = false) String objectType,
			@RequestParam(value = "objectRefId", required = false) String objectRefId,
			@RequestParam(value = "favor", required = false) String favor) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.OBJECT_TYPE, objectType, ValidationUtil.OBJECT_REF_ID, objectRefId,
				ValidationUtil.FAVOR, favor);
		
		Byte objectTypeB = Byte.valueOf(objectType);
		Long objectRefIdL = Long.valueOf(objectRefId);
		
		// 业务调用
		if ("1".equals(favor)) {
			bizObjectService.addFavor(RequestContext.checkAndGetUserId(), objectTypeB, objectRefIdL);
		} else {
			bizObjectService.removeFavor(RequestContext.checkAndGetUserId(), objectTypeB, objectRefIdL);
		}
		// 返回结果
		View view = ViewUtil.defaultView();
		return view;
	}

	@RequestMapping("/addComment")
	@ResponseBody
	public View addComment(@RequestParam(value = "objectType", required = false) String objectType,
			@RequestParam(value = "objectRefId", required = false) String objectRefId,
			@RequestParam(value = "comment", required = false) String comment,
			@RequestParam(value = "toCommentId", required = false) String toCommentId) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.OBJECT_TYPE, objectType, ValidationUtil.OBJECT_REF_ID, objectRefId,
				ValidationUtil.COMMENT, comment);

		if (StringUtils.isNotEmpty(toCommentId)) {
			ValidationUtil.check(ValidationUtil.TO_COMMENT_ID, toCommentId);
		}

		Byte objectTypeB = Byte.valueOf(objectType);
		Long objectRefIdL = Long.valueOf(objectRefId);
		Long toCommentIdL = null;
		if (StringUtils.isNotEmpty(toCommentId)) {
			toCommentIdL = Long.valueOf(toCommentId);
		}

		// 业务调用
		Long commentId = bizObjectService.addComment(RequestContext.checkAndGetUserId(), objectTypeB, objectRefIdL,
				comment, toCommentIdL);
		CommentVo vo = objectBiz.queryComment(commentId);

		// 返回结果
		CommentBody body = new CommentBody();
		body.setComment(vo);

		View view = ViewUtil.defaultView();
		return view;
	}

	@RequestMapping("/removeComment")
	@ResponseBody
	public View removeComment(@RequestParam(value = "commentId", required = false) String commentId) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.COMMENT_ID, commentId);

		Long commentIdL = Long.valueOf(commentId);

		// 业务调用
		bizObjectService.removeComment(RequestContext.checkAndGetUserId(), commentIdL);

		// 返回结果
		View view = ViewUtil.defaultView();
		return view;
	}

	@RequestMapping("/listComments")
	@ResponseBody
	public View listComments(@RequestParam(value = "objectType", required = false) String objectType,
			@RequestParam(value = "objectRefId", required = false) String objectRefId) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.OBJECT_TYPE, objectType, ValidationUtil.OBJECT_REF_ID, objectRefId);

		Byte objectTypeB = Byte.valueOf(objectType);
		Long objectRefIdL = Long.valueOf(objectRefId);

		// 业务调用
		List<CommentVo> commentVoList = objectBiz.listComments(objectTypeB, objectRefIdL);

		// 返回结果
		CommentListBody body = new CommentListBody();
		body.setCommentList(commentVoList);

		View view = ViewUtil.defaultView();
		return view;
	}

	@RequestMapping("/listArticles")
	@ResponseBody
	public View listArticles(@RequestParam(value = "orderBy", required = false) String orderBy,
							 @RequestParam(value = "offset", required = false) String offset,
							 @RequestParam(value = "count", required = false) String count) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.ORDER_BY, orderBy, ValidationUtil.OFFSET, offset, ValidationUtil.COUNT,
				count);

		Byte orderByB = Byte.valueOf(orderBy);
		Long offsetL = Long.valueOf(offset);
		Integer countI = Integer.valueOf(count);

		// 业务调用
		List<ObjectVo> list = objectBiz.listArticles(orderByB, offsetL, countI);

		// 返回结果
		ObjectListBody body = new ObjectListBody();
		body.setObjectList(list);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

	@RequestMapping("/listPublishs")
	@ResponseBody
	public View listPublishs(@RequestParam(value = "range", required = false) String range,
							 @RequestParam(value = "orderBy", required = false) String orderBy,
							 @RequestParam(value = "offset", required = false) String offset,
							 @RequestParam(value = "count", required = false) String count) {
		// 参数校验
		ValidationUtil.check(ValidationUtil.RANGE, range, ValidationUtil.ORDER_BY, orderBy, ValidationUtil.OFFSET,
				offset, ValidationUtil.COUNT, count);

		Byte orderByB = Byte.valueOf(orderBy);
		Long offsetL = Long.valueOf(offset);
		Integer countI = Integer.valueOf(count);

		List<ObjectVo> list = null;
		// 业务调用
		if ("0".equals(range)) { // 所有
			list = objectBiz.listPublishs(orderByB, offsetL, countI);

		} else { // 仅关注用户
			list = objectBiz.listPublishs(RequestContext.checkAndGetUserId(), orderByB, offsetL, countI);
		}

		// 返回结果
		ObjectListBody body = new ObjectListBody();
		body.setObjectList(list);

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}
	
	@RequestMapping("/addPublish")
	@ResponseBody
	public View addPublish(@RequestParam(value = "publishTitle", required = false) String publishTitle,
			@RequestParam(value = "publishText", required = false) String publishText,
			@RequestParam(value = "resources", required = false) String resources) {
		// 参数校验
//		ValidationUtil.check(ValidationUtil.RANGE, range, ValidationUtil.ORDER_BY, orderBy, ValidationUtil.OFFSET,
//				offset, ValidationUtil.COUNT, count);
//		
//		Byte orderByB = Byte.valueOf(orderBy);
//		Long offsetL = Long.valueOf(offset);
//		Integer countI = Integer.valueOf(count);
		
		// 业务调用
		publishService.addPublish(RequestContext.checkAndGetUserId(), publishTitle, publishText, resources);
		
		// 返回结果
		
		View view = ViewUtil.defaultView();
		return view;
	}
}
