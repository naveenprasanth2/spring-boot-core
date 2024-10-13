package com.dailycodebuffer.springbootcore.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class UniqueElementsValidation implements ConstraintValidator<UniqueEmailValidator, String> {

    List<String> emailList = List.of("naveen@gmail.com", "naveen1@gmail.com", "naveen2@gmail.com");

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return !emailList.contains(s);
    }
}
