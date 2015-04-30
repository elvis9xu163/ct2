package com.xjd.ct.utl.enums;

/**
 * 资源用途大类
 * 
 * @author elvis.xu
 * @since 2014-9-18
 */
public enum EntityTypeEnum {

	OBJECT((byte) 1, "业务对象"), USER((byte) 2, "用户");

	byte code;
	String desc;

	EntityTypeEnum(byte code, String desc) {
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
		return EntityTypeEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static EntityTypeEnum valueOfCode(Byte code) {
		if (code == null) {
			return null;
		}
		for (EntityTypeEnum e : EntityTypeEnum.values()) {
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
