package com.xjd.ct.utl.valid;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import com.xjd.ct.utl.enums.IdolOperEnum;
import com.xjd.ct.utl.enums.ObjectTypeEnum;
import com.xjd.ct.utl.enums.OrderByEnum;
import com.xjd.ct.utl.enums.UserSexEnum;
import com.xjd.ct.utl.respcode.RespCode;
import com.xjd.ct.utl.valid.constraints.Date;
import com.xjd.ct.utl.valid.constraints.Date.DatePattern;

public class ValidationBean {

	@NotBlank(message = RespCode.RESP_0001)
	@Date(pattern = DatePattern.yyyyMMddHHmmssSSS)
	private String timestamp;

	@NotBlank(message = RespCode.RESP_0001)
	@Date(pattern = DatePattern.yyyyMMdd)
	private String babyBirth;

	@NotBlank(message = RespCode.RESP_0001)
	@Pattern(regexp = "^((13[0-9])|(14[5,7])|(15[^4,\\D])|(170)|(18[^4,\\D]))\\d{8}$", message = RespCode.RESP_0002)
	private String mobile;

	@NotBlank(message = RespCode.RESP_0001)
	@Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$", message = RespCode.RESP_0002)
	private String email;

	@NotBlank(message = RespCode.RESP_0001)
	@Pattern(regexp = "(^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$)|(^((13[0-9])|(14[5,7])|(15[^4,\\D])|(170)|(18[^4,\\D]))\\d{8}$)", message = RespCode.RESP_0120)
	private String username;

	@NotBlank(message = RespCode.RESP_0001)
	private String password;

	@NotBlank(message = RespCode.RESP_0001)
	@Digits(integer = 18, fraction = 0, message = RespCode.RESP_0002)
	private String userId;

	@NotBlank(message = RespCode.RESP_0001)
	@com.xjd.ct.utl.valid.constraints.Enum(enumClass = UserSexEnum.class)
	private String sex;

	@NotBlank(message = RespCode.RESP_0001)
	@com.xjd.ct.utl.valid.constraints.Enum(enumClass = UserSexEnum.class)
	private String babySex;

	@NotBlank(message = RespCode.RESP_0001)
	@com.xjd.ct.utl.valid.constraints.Enum(enumClass = IdolOperEnum.class)
	private String idolOper;

	@NotBlank(message = RespCode.RESP_0001)
	@Digits(integer = 18, fraction = 0, message = RespCode.RESP_0002)
	private String offset;

	@NotBlank(message = RespCode.RESP_0001)
	@Digits(integer = 2, fraction = 0, message = RespCode.RESP_0002)
	private String count;

	@NotBlank(message = RespCode.RESP_0001)
	@com.xjd.ct.utl.valid.constraints.Enum(enumClass = ObjectTypeEnum.class)
	private String objectType;

	@NotBlank(message = RespCode.RESP_0001)
	@Digits(integer = 18, fraction = 0, message = RespCode.RESP_0002)
	private String objectRefId;

	@NotBlank(message = RespCode.RESP_0001)
	@Pattern(regexp = "0|1", message = RespCode.RESP_0003)
	private String like;

	@NotBlank(message = RespCode.RESP_0001)
	@Pattern(regexp = "0|1", message = RespCode.RESP_0003)
	private String favor;

	@NotBlank(message = RespCode.RESP_0001)
	private String comment;

	@NotBlank(message = RespCode.RESP_0001)
	@Digits(integer = 18, fraction = 0, message = RespCode.RESP_0002)
	private String toCommentId;

	@NotBlank(message = RespCode.RESP_0001)
	@Digits(integer = 18, fraction = 0, message = RespCode.RESP_0002)
	private String commentId;

	@NotBlank(message = RespCode.RESP_0001)
	@Digits(integer = 18, fraction = 0, message = RespCode.RESP_0002)
	private String subscribeId;

	@NotBlank(message = RespCode.RESP_0001)
	@Pattern(regexp = "0|1", message = RespCode.RESP_0003)
	private String subscribe;

	@NotBlank(message = RespCode.RESP_0001)
	@Digits(integer = 18, fraction = 0, message = RespCode.RESP_0002)
	private String ageBracketIdL;

	@NotBlank(message = RespCode.RESP_0001)
	@Pattern(regexp = "0|1", message = RespCode.RESP_0003)
	private String set;

	@NotBlank(message = RespCode.RESP_0001)
	@com.xjd.ct.utl.valid.constraints.Enum(enumClass = OrderByEnum.class)
	private String orderBy;

	@NotBlank(message = RespCode.RESP_0001)
	@Pattern(regexp = "0|1", message = RespCode.RESP_0003)
	private String range;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBabySex() {
		return babySex;
	}

	public void setBabySex(String babySex) {
		this.babySex = babySex;
	}

	public String getIdolOper() {
		return idolOper;
	}

	public void setIdolOper(String idolOper) {
		this.idolOper = idolOper;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	/** @return the objectType */
	public String getObjectType() {
		return objectType;
	}

	/** @param objectType the objectType to set */
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	/** @return the objectRefId */
	public String getObjectRefId() {
		return objectRefId;
	}

	/** @param objectRefId the objectRefId to set */
	public void setObjectRefId(String objectRefId) {
		this.objectRefId = objectRefId;
	}

	/** @return the like */
	public String getLike() {
		return like;
	}

	/** @param like the like to set */
	public void setLike(String like) {
		this.like = like;
	}

	/** @return the favor */
	public String getFavor() {
		return favor;
	}

	/** @param favor the favor to set */
	public void setFavor(String favor) {
		this.favor = favor;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getToCommentId() {
		return toCommentId;
	}

	public void setToCommentId(String toCommentId) {
		this.toCommentId = toCommentId;
	}

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public String getSubscribeId() {
		return subscribeId;
	}

	public void setSubscribeId(String subscribeId) {
		this.subscribeId = subscribeId;
	}

	public String getSubscribe() {
		return subscribe;
	}

	public void setSubscribe(String subscribe) {
		this.subscribe = subscribe;
	}

	public String getAgeBracketIdL() {
		return ageBracketIdL;
	}

	public void setAgeBracketIdL(String ageBracketIdL) {
		this.ageBracketIdL = ageBracketIdL;
	}

	public String getSet() {
		return set;
	}

	public void setSet(String set) {
		this.set = set;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}
}
