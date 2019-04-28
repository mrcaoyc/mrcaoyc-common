package com.github.mrcaoyc.common.exception.runtime;

import com.github.mrcaoyc.common.exception.BaseErrorMessage;
import com.github.mrcaoyc.common.exception.BaseRuntimeException;

/**
 * 请求无效异常
 *
 * @author CaoYongCheng
 */
public class BadRequestException extends BaseRuntimeException {

    public BadRequestException(BaseErrorMessage errorMessage) {
        super(errorMessage);
    }

    public BadRequestException(BaseErrorMessage errorMessage, Throwable throwable) {
        super(errorMessage, throwable);
    }

    public BadRequestException(int code, String message) {
        super(code, message);
    }

    public BadRequestException(int code, String message, Throwable throwable) {
        super(code, message, throwable);
    }
}
