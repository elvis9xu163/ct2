package com.xjd.ct.utl.enums;

/**
 * 布尔枚举
 * 
 * @author elvis.xu
 * @since 2014-9-18
 */
public enum BoolEnum {

	FALSE((byte) 0, "否"), TRUE((byte) 1, "是");

	byte code;
	String desc;

	BoolEnum(byte code, String desc) {
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
		return BoolEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static BoolEnum valueOfCode(Byte code) {
		if (code == null) {
			return null;
		}
		for (BoolEnum e : BoolEnum.values()) {
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

	public static boolean parseCode(Byte code) {
		return valueOfCode(code) == BoolEnum.TRUE;
	}
}
