package com.xjd.ct.utl.enums;

/**
 * 资源用途大类
 * 
 * @author elvis.xu
 * @since 2014-9-18
 */
public enum ResForClassEnum {

	HEAD_IMG((byte) 1, "头像"), LIST_IMG((byte) 2, "列表封面"), DETAIL_IMG((byte) 3, "详情图片");

	byte code;
	String desc;

	ResForClassEnum(byte code, String desc) {
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
		return ResForClassEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static ResForClassEnum valueOfCode(Byte code) {
		if (code == null) {
			return null;
		}
		for (ResForClassEnum e : ResForClassEnum.values()) {
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
