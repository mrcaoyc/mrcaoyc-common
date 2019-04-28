package com.github.mrcaoyc.common.exception.runtime;

import com.github.mrcaoyc.common.exception.BaseErrorMessage;
import com.github.mrcaoyc.common.exception.BaseRuntimeException;

/**
 * 未授权异常
 *
 * @author CaoYongCheng
 */
public class ForbiddenException extends BaseRuntimeException {
    private static final long serialVersionUID = 1L;

    public ForbiddenException(BaseErrorMessage errorMessage) {
        super(errorMessage);
    }

    public ForbiddenException(BaseErrorMessage errorMessage, Throwable throwable) {
        super(errorMessage, throwable);
    }

    public ForbiddenException(int code, String message) {
        super(code, message);
    }

    public ForbiddenException(int code, String message, Throwable throwable) {
        super(code, message, throwable);
    }
}