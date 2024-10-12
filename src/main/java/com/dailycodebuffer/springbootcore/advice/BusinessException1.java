package com.dailycodebuffer.springbootcore.advice;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Getter
@Setter
public class BusinessException1 extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;
    private final int code;
    private final String message;

    public BusinessException1(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }
}
