package com.xjd.ct.utl.enums;

/**
 * YES OR NO
 * 
 * @author elvis.xu
 * @since 2014-9-18
 */
public enum YesNoEnum {

	NO((byte) 0, "NO"), YES((byte) 1, "YES");

	byte code;
	String desc;

	YesNoEnum(byte code, String desc) {
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
		return YesNoEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static YesNoEnum valueOfCode(Byte code) {
		if (code == null) {
			return null;
		}
		for (YesNoEnum e : YesNoEnum.values()) {
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
