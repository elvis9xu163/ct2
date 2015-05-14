package com.xjd.ct.app.view.vo;

import java.util.List;

/**
 * @author elvis.xu
 * @since 2015-05-14 23:18
 */
public class UserInfoSimplestVo {
	private Long userId;

	private Byte userType;

	private Integer gradeExp;

	private Byte gradeLevel;

	private Integer point;

	private String nickname;

	private Byte sex;

	//
	private List<ResourceVo> resourceList;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Byte getUserType() {
		return userType;
	}

	public void setUserType(Byte userType) {
		this.userType = userType;
	}

	public Integer getGradeExp() {
		return gradeExp;
	}

	public void setGradeExp(Integer gradeExp) {
		this.gradeExp = gradeExp;
	}

	public Byte getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(Byte gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Byte getSex() {
		return sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public List<ResourceVo> getResourceList() {
		return resourceList;
	}

	public void setResourceList(List<ResourceVo> resourceList) {
		this.resourceList = resourceList;
	}
}
