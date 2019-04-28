package com.github.mrcaoyc.common.exception.runtime;

import com.github.mrcaoyc.common.exception.BaseErrorMessage;
import com.github.mrcaoyc.common.exception.BaseRuntimeException;

/**
 * 数据校验异常
 *
 * @author CaoYongCheng
 */
public class DataValidateException extends BaseRuntimeException {

    public DataValidateException(BaseErrorMessage errorMessage) {
        super(errorMessage);
    }

    public DataValidateException(BaseErrorMessage errorMessage, Throwable throwable) {
        super(errorMessage, throwable);
    }

    public DataValidateException(int code, String message) {
        super(code, message);
    }

    public DataValidateException(int code, String message, Throwable throwable) {
        super(code, message, throwable);
    }
}