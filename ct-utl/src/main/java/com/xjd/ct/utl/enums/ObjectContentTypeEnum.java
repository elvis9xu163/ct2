package com.xjd.ct.utl.enums;

/**
 * 对象类型
 * 
 * @author elvis.xu
 * @since 2014-9-18
 */
public enum ObjectContentTypeEnum {

	TEXT((byte) 1, "文字"), LINK((byte) 2, "链接");

	byte code;
	String desc;

	ObjectContentTypeEnum(byte code, String desc) {
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
		return ObjectContentTypeEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static ObjectContentTypeEnum valueOfCode(Byte code) {
		if (code == null) {
			return null;
		}
		for (ObjectContentTypeEnum e : ObjectContentTypeEnum.values()) {
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
