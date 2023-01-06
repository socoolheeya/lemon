package com.sweeti.lemon.common.error;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ErrorMessage {
    private String name;
    private int number;
    private int statusCode;
    private String message;
}
