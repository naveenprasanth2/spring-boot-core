package com.dailycodebuffer.springbootcore.validators.validations;

import com.dailycodebuffer.springbootcore.validators.annotations.UniqueNameValidator;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueNameValidation implements ConstraintValidator<UniqueNameValidator, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
