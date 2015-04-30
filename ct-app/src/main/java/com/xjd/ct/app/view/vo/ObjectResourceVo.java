package com.xjd.ct.app.view.vo;

/**
 * @author elvis.xu
 * @since 2015-04-20 23:53
 */
public class ObjectResourceVo extends ResourceVo {
	private Byte objectType;

	private Long objectRefId;

	private Byte forClass;

	private String forSubclass;

	private Byte finishProcess;

	public Byte getObjectType() {
		return objectType;
	}

	public void setObjectType(Byte objectType) {
		this.objectType = objectType;
	}

	public Long getObjectRefId() {
		return objectRefId;
	}

	public void setObjectRefId(Long objectRefId) {
		this.objectRefId = objectRefId;
	}

	public Byte getForClass() {
		return forClass;
	}

	public void setForClass(Byte forClass) {
		this.forClass = forClass;
	}

	public String getForSubclass() {
		return forSubclass;
	}

	public void setForSubclass(String forSubclass) {
		this.forSubclass = forSubclass;
	}

	/** @return the finishProcess */
	public Byte getFinishProcess() {
		return finishProcess;
	}

	/** @param finishProcess the finishProcess to set */
	public void setFinishProcess(Byte finishProcess) {
		this.finishProcess = finishProcess;
	}

}
