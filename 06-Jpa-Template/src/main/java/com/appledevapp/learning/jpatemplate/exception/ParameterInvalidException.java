package com.appledevapp.learning.jpatemplate.exception;

/**
 * 自定义异常 - 参数检查异常
 */
public class ParameterInvalidException extends MarkedException {

    public ParameterInvalidException(String message) {
        super(message);
    }
}
