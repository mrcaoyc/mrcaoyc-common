package com.github.mrcaoyc.common.exception.runtime;

import com.github.mrcaoyc.common.exception.BaseErrorMessage;

/**
 * 未提供身份异常
 *
 * @author CaoYongCheng
 */
public class CredentialsNotFoundException extends UnauthorizedException {

    public CredentialsNotFoundException(BaseErrorMessage errorMessage) {
        super(errorMessage);
    }

    public CredentialsNotFoundException(BaseErrorMessage errorMessage, Throwable throwable) {
        super(errorMessage, throwable);
    }

    public CredentialsNotFoundException(int code, String message) {
        super(code, message);
    }

    public CredentialsNotFoundException(int code, String message, Throwable throwable) {
        super(code, message, throwable);
    }
}