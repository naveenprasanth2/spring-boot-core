package com.dailycodebuffer.springbootcore.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Setter
@Getter
public class ControllerException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;
    private final int code;
    private final String message;

    public ControllerException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }
}
