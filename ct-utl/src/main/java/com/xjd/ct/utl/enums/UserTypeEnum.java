package com.xjd.ct.utl.enums;

/**
 * 用户类别
 * 
 * @author elvis.xu
 * @since 2014-9-18
 */
public enum UserTypeEnum {

	ADMIN((byte) 0, "管理员"), CERTED((byte) 10, "认证用户"), NORMAL((byte) 20, "普通用户");

	byte code;
	String desc;

	UserTypeEnum(byte code, String desc) {
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
		return UserTypeEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static UserTypeEnum valueOfCode(Byte code) {
		if (code == null) {
			return null;
		}
		for (UserTypeEnum e : UserTypeEnum.values()) {
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
