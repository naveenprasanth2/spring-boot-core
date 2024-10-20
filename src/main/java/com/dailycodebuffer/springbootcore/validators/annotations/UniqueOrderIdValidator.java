package com.dailycodebuffer.springbootcore.validators.annotations;


import com.dailycodebuffer.springbootcore.validators.validations.UniqueOrderIdValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueOrderIdValidation.class)
public @interface UniqueOrderIdValidator {
    String message() default "Please provide a unique order id";
    Class<?>[] groups() default {};
    Class <? extends Payload>[] payload() default {};
}
