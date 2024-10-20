package com.dailycodebuffer.springbootcore.validators.annotations;


import com.dailycodebuffer.springbootcore.validators.validations.UniqueMobileValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueMobileValidation.class)
public @interface UniqueMobileValidator {
    String message() default "Please enter a valid mobile number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
