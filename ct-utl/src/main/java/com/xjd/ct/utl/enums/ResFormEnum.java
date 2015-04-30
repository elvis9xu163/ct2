package com.xjd.ct.utl.enums;

/**
 * 资源形式类型
 * 
 * @author elvis.xu
 * @since 2014-9-18
 */
public enum ResFormEnum {

	FILE((byte) 1, "文件"), LINK((byte) 2, "链接");

	byte code;
	String desc;

	ResFormEnum(byte code, String desc) {
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
		return ResFormEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static ResFormEnum valueOfCode(Byte code) {
		if (code == null) {
			return null;
		}
		for (ResFormEnum e : ResFormEnum.values()) {
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
