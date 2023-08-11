package com.dhg.auth.config.exception;

/**
 * @author Pro-dhg
 * @description: 未登录的异常
 */
public class UnauthenticatedException extends RuntimeException {
    public UnauthenticatedException() {
        super("未登录");
    }
}
