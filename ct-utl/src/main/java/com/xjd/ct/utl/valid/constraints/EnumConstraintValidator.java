package com.xjd.ct.utl.valid.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.xjd.ct.utl.EnumUtil;

/**
 * <pre>
 * 
 * </pre>
 * 
 * @author elvis.xu
 * @since 2014-9-18
 */
public class EnumConstraintValidator implements ConstraintValidator<Enum, String> {

	private Class enumClass;

	@Override
	public void initialize(Enum constraintAnnotation) {
		this.enumClass = constraintAnnotation.enumClass();
		if (enumClass == null) {
			throw new IllegalArgumentException("To use constraint Enum, 'enumClass' must be set.");
		}
		if (!java.lang.Enum.class.isAssignableFrom(enumClass)) {
			throw new IllegalArgumentException("To use constraint Enum, 'enumClass' must be class of enums.");
		}
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return EnumUtil.valid(enumClass, value);
	}

}
