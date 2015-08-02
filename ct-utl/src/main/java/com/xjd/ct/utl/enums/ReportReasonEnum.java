package com.xjd.ct.utl.enums;

/**
 * 举报原因
 * 
 * @author elvis.xu
 * @since 2014-9-18
 */
public enum ReportReasonEnum {

	OHTER((byte) 0, "其它"), SEX((byte) 1, "色情"), POLITICS((byte) 2, "政治"), EMBEZZLE((byte) 3, "盗用"), ERROR_RECOVER((byte) 4, "纠错");

	byte code;
	String desc;

	ReportReasonEnum(byte code, String desc) {
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
		return ReportReasonEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static ReportReasonEnum valueOfCode(Byte code) {
		if (code == null) {
			return null;
		}
		for (ReportReasonEnum e : ReportReasonEnum.values()) {
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
