package com.github.mrcaoyc.common.exception;

/**
 * 异常响应实体
 *
 * @author CaoYongCheng
 */
public class ErrorMessage {
    private int code;
    private String message;

    public ErrorMessage(BaseErrorMessage baseErrorMessage) {
        if (baseErrorMessage == null) {
            throw new IllegalArgumentException("baseErrorMessage is null");
        }
        this.code = baseErrorMessage.getCode();
        this.message = baseErrorMessage.getMessage();
    }

    public ErrorMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
