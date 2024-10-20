package com.dailycodebuffer.springbootcore.validators.validations;

import com.dailycodebuffer.springbootcore.validators.annotations.UniqueMobileValidator;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueMobileValidation implements ConstraintValidator<UniqueMobileValidator, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
