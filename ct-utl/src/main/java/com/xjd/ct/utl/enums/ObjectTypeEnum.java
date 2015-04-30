package com.xjd.ct.utl.enums;

/**
 * 对象类型
 * 
 * @author elvis.xu
 * @since 2014-9-18
 */
public enum ObjectTypeEnum {

	ARTICLE((byte) 1, "文章"), PUBLISH((byte) 2, "用户发表"), TOPIC((byte) 3, "话题"), USER((byte) 4, "用户");

	byte code;
	String desc;

	ObjectTypeEnum(byte code, String desc) {
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
		return ObjectTypeEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static ObjectTypeEnum valueOfCode(Byte code) {
		if (code == null) {
			return null;
		}
		for (ObjectTypeEnum e : ObjectTypeEnum.values()) {
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
