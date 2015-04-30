package com.xjd.ct.utl.enums;

/**
 * 排序类型
 * 
 * @author elvis.xu
 * @since 2014-9-18
 */
public enum OrderByEnum {

	TIME_DESC((byte) 1, "时间倒序"), HOT_DESC((byte) 2, "执度倒序");

	byte code;
	String desc;

	OrderByEnum(byte code, String desc) {
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
		return OrderByEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static OrderByEnum valueOfCode(Byte code) {
		if (code == null) {
			return null;
		}
		for (OrderByEnum e : OrderByEnum.values()) {
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
