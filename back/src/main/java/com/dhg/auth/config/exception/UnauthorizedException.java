package com.dhg.auth.config.exception;

/**
 * @author Pro-dhg
 * @description: 访问权限不足的接口/数据 所报的异常
 */
public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException() {
        super("用户无此接口权限");
    }
}
