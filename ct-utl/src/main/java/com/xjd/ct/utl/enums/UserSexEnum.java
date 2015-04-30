package com.xjd.ct.utl.enums;

/**
 * 用户性别
 * 
 * @author elvis.xu
 * @since 2014-9-18
 */
public enum UserSexEnum {

	FEMALE((byte) 0, "女"), MALE((byte) 1, "男");

	byte code;
	String desc;

	UserSexEnum(byte code, String desc) {
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
		return UserSexEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static UserSexEnum valueOfCode(Byte code) {
		if (code == null) {
			return null;
		}
		for (UserSexEnum e : UserSexEnum.values()) {
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
