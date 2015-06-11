package com.xjd.ct.utl.valid.constraints;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.xjd.ct.utl.respcode.RespCode;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { DateConstraintValidator.class })
public @interface Timestamp {

	String message() default RespCode.RESP_0002;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
