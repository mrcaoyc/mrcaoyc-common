package com.github.mrcaoyc.common.exception;

/**
 * 所有异常信息需要实现的接口
 *
 * @author CaoYongCheng
 */
public interface BaseErrorMessage {
    /**
     * 错误码
     *
     * @return 错误码
     */
    int getCode();

    /**
     * 错误信息
     *
     * @return 错误信息
     */
    String getMessage();
}
