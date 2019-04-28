package com.github.mrcaoyc.common.exception.runtime;

import com.github.mrcaoyc.common.exception.BaseErrorMessage;
import com.github.mrcaoyc.common.exception.BaseRuntimeException;

/**
 * 禁止访问异常
 *
 * @author CaoYongCheng
 */
public class UnauthorizedException extends BaseRuntimeException {
    private static final long serialVersionUID = 1L;

    public UnauthorizedException(BaseErrorMessage errorMessage) {
        super(errorMessage);
    }

    public UnauthorizedException(BaseErrorMessage errorMessage, Throwable throwable) {
        super(errorMessage, throwable);
    }

    public UnauthorizedException(int code, String message) {
        super(code, message);
    }

    public UnauthorizedException(int code, String message, Throwable throwable) {
        super(code, message, throwable);
    }
}