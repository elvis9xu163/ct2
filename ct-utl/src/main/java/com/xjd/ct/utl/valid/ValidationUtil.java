package com.xjd.ct.utl.valid;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.apache.commons.collections.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xjd.ct.utl.respcode.RespCode;
import com.xjd.ct.utl.exception.BusinessException;

public abstract class ValidationUtil implements ValidationProperties {
	private static Logger log = LoggerFactory.getLogger(ValidationUtil.class);

	protected static ThreadLocal<ValidationBean> beanThreadLocal = new ThreadLocal<ValidationBean>();
	protected static Validator validator;
	protected static Map<String, Method> setterMap = new HashMap<String, Method>();
	static {
		ValidatorFactory vfactory = Validation.buildDefaultValidatorFactory();
		validator = vfactory.getValidator();
		Method[] methods = ValidationBean.class.getMethods();
		for (Method m : methods) {
			String mn = m.getName();
			if (mn.startsWith("set") && mn.length() > 3 && m.getReturnType().equals(Void.TYPE) && m.getParameterTypes().length == 1
					&& m.getParameterTypes()[0].equals(String.class)) { // ...
				setterMap.put(mn.substring(3, 4).toLowerCase() + mn.substring(4), m);
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public static void check(String... array) {
		Map map = MapUtils.putAll(new HashMap(), array);
		check(map);
	}

	public static void check(Map<String, String> map) {
		Set<ConstraintViolation<ValidationBean>> set = validOneByOne(map);
		if (!set.isEmpty()) {
			@SuppressWarnings("rawtypes")
			ConstraintViolation[] cv = set.toArray(new ConstraintViolation[set.size()]);
			throw new BusinessException(cv[0].getMessage(), new Object[] { cv[0].getPropertyPath(), cv[0].getInvalidValue() });
		}
	}

	@SuppressWarnings("rawtypes")
	public static boolean valid(String... array) {
		Map map = MapUtils.putAll(new HashMap(), array);
		return valid(map);
	}

	public static boolean valid(Map<String, String> map) {
		Set<ConstraintViolation<ValidationBean>> set = validOneByOne(map);
		if (!set.isEmpty()) {
			return false;
		}
		return true;
	}

	public static Set<ConstraintViolation<ValidationBean>> validOneByOne(Map<String, String> map) {
		ValidationBean bean = getValidationBean();
		for (Entry<String, String> entry : map.entrySet()) {
			String prop = entry.getKey();
			Method m = setterMap.get(prop);
			try {
				m.invoke(bean, entry.getValue());
			} catch (Exception e) {
				log.error("", e);
				throw new BusinessException(RespCode.RESP_9999);
			}
			Set<ConstraintViolation<ValidationBean>> set = validator.validateProperty(bean, prop);
			if (!set.isEmpty()) {
				return set;
			}
		}
		return Collections.<ConstraintViolation<ValidationBean>> emptySet();
	}

	public static Set<ConstraintViolation<ValidationBean>> validAll(Map<String, String> map) {
		Set<ConstraintViolation<ValidationBean>> allSet = new TreeSet<ConstraintViolation<ValidationBean>>();
		ValidationBean bean = getValidationBean();
		for (Entry<String, String> entry : map.entrySet()) {
			String prop = entry.getKey();
			Method m = setterMap.get(prop);
			try {
				m.invoke(bean, entry.getValue());
			} catch (Exception e) {
				log.error("", e);
				throw new BusinessException(RespCode.RESP_9999);
			}
			Set<ConstraintViolation<ValidationBean>> set = validator.validateProperty(bean, prop);
			allSet.addAll(set);
		}
		return allSet;
	}

	protected static ValidationBean getValidationBean() {
		ValidationBean bean = beanThreadLocal.get();
		if (bean == null) {
			bean = new ValidationBean();
			beanThreadLocal.set(bean);
		}
		return bean;
	}

}
