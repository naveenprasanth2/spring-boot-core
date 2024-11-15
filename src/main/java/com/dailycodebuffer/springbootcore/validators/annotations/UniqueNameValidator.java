package com.dailycodebuffer.springbootcore.validators.annotations;

import com.dailycodebuffer.springbootcore.validators.validations.UniqueNameValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueNameValidation.class)
public @interface UniqueNameValidator {
    String message() default "Please enter a unique name";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
