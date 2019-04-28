package com.github.mrcaoyc.common.exception.runtime;

import com.github.mrcaoyc.common.exception.BaseCheckedException;
import com.github.mrcaoyc.common.exception.BaseErrorMessage;

/**
 * 远程调用异常，调用方必须处理，不允许直接抛给外层框架
 *
 * @author CaoYongCheng
 */
public class RemoteClientException extends BaseCheckedException {
    private static final long serialVersionUID = 1L;

    private Integer httpStatus;

    public RemoteClientException(BaseErrorMessage errorMessage, Integer httpStatus) {
        super(errorMessage);
        this.httpStatus = httpStatus;
    }

    public RemoteClientException(BaseErrorMessage errorMessage, Integer httpStatus, Throwable throwable) {
        super(errorMessage, throwable);
        this.httpStatus = httpStatus;
    }

    public RemoteClientException(int code, String message, Integer httpStatus) {
        super(code, message);
        this.httpStatus = httpStatus;
    }

    public RemoteClientException(int code, String message, Integer httpStatus, Throwable throwable) {
        super(code, message, throwable);
        this.httpStatus = httpStatus;
    }

    public Integer getHttpStatus() {
        return httpStatus;
    }
}
