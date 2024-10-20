package com.dailycodebuffer.springbootcore.validators.validations;

import com.dailycodebuffer.springbootcore.validators.annotations.UniqueOrderIdValidator;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueOrderIdValidation implements ConstraintValidator<UniqueOrderIdValidator, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
