package com.xjd.ct.utl.enums;

/**
 * 关注/取消关注动作
 * 
 * @author elvis.xu
 * @since 2014-9-18
 */
public enum IdolOperEnum {

	CANCEL((byte) 0, "取消"), ADD((byte) 1, "添加");

	byte code;
	String desc;

	IdolOperEnum(byte code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public byte getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public String toString() {
		return IdolOperEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static IdolOperEnum valueOfCode(Byte code) {
		if (code == null) {
			return null;
		}
		for (IdolOperEnum e : IdolOperEnum.values()) {
			if (e.getCode() == code.byteValue()) {
				return e;
			}
		}
		return null;
	}

	public static boolean validCode(String code) {
		Byte val = null;
		try {
			val = Byte.valueOf(code);
		} catch (NumberFormatException e) {
			return false;
		}
		if (valueOfCode(val) == null) {
			return false;
		}
		return true;
	}

}
