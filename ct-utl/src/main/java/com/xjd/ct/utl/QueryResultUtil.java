package com.xjd.ct.utl;

import java.util.List;

import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

public abstract class QueryResultUtil {

	/**
	 * 判断查询结果为0条或1条 如果有多条则抛出异常
	 * 
	 * @param result
	 * @param args
	 */
	public static void assertMaxOne(List<?> result, Object... args) {
		if (result != null && result.size() > 1) {
			StringBuilder sb = new StringBuilder("db query return too many results. size=");
			sb.append(result.size());
			if (args == null || args.length == 0) {
				sb.append(", args=null");
			} else {
				sb.append(", args=");
				for (Object arg : args) {
					sb.append(arg);
					sb.append(",");
				}
				sb.deleteCharAt(sb.length() - 1);
			}

			throw new BusinessException(RespCode.RESP_9999, RespCode.RESP_9900, sb.toString());
		}
	}
}
