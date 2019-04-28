package com.github.mrcaoyc.common.exception.runtime;

import com.github.mrcaoyc.common.exception.BaseErrorMessage;

/**
 * 身份无效异常
 *
 * @author CaoYongCheng
 */
public class CredentialsInvalidException extends UnauthorizedException {
    private static final long serialVersionUID = 1L;

    public CredentialsInvalidException(BaseErrorMessage errorMessage) {
        super(errorMessage);
    }

    public CredentialsInvalidException(BaseErrorMessage errorMessage, Throwable throwable) {
        super(errorMessage, throwable);
    }

    public CredentialsInvalidException(int code, String message) {
        super(code, message);
    }

    public CredentialsInvalidException(int code, String message, Throwable throwable) {
        super(code, message, throwable);
    }
}