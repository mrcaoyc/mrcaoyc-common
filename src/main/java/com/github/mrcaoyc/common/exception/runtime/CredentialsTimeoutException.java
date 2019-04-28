package com.github.mrcaoyc.common.exception.runtime;

import com.github.mrcaoyc.common.exception.BaseErrorMessage;

/**
 * 身份超时异常
 *
 * @author CaoYongCheng
 */
public class CredentialsTimeoutException extends UnauthorizedException {
    private static final long serialVersionUID = 1L;

    public CredentialsTimeoutException(BaseErrorMessage errorMessage) {
        super(errorMessage);
    }

    public CredentialsTimeoutException(BaseErrorMessage errorMessage, Throwable throwable) {
        super(errorMessage, throwable);
    }

    public CredentialsTimeoutException(int code, String message) {
        super(code, message);
    }

    public CredentialsTimeoutException(int code, String message, Throwable throwable) {
        super(code, message, throwable);
    }
}