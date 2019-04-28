package com.github.mrcaoyc.common.exception.runtime;

import com.github.mrcaoyc.common.exception.BaseErrorMessage;
import com.github.mrcaoyc.common.exception.BaseRuntimeException;

/**
 * 业务异常
 *
 * @author CaoYongCheng
 */
public class BusinessException extends BaseRuntimeException {
    private static final long serialVersionUID = 1L;

    public BusinessException(BaseErrorMessage errorMessage) {
        super(errorMessage);
    }

    public BusinessException(BaseErrorMessage errorMessage, Throwable throwable) {
        super(errorMessage, throwable);
    }

    public BusinessException(int code, String message) {
        super(code, message);
    }

    public BusinessException(int code, String message, Throwable throwable) {
        super(code, message, throwable);
    }
}
