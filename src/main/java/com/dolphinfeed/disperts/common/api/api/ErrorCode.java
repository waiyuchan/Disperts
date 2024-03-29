package com.dolphinfeed.disperts.common.api.api;

public enum ErrorCode {

    SUCCESS(0, "请求成功"),

    INVALID_PARAMETERS(10001, "无效的参数"),
    MISSING_PARAMETERS(10002, ""),
    UNAUTHORIZED_ACCESS(10003, ""),
    ACCESS_FORBIDDEN(10004, ""),
    INVALID_USER_CREDENTIALS(10005, ""),
    USER_ALREADY_EXISTS(10006, "用户已存在"),
    USER_NOT_FOUND(10007, "用户不存在"),
    USER_DISABLED(10008, ""),
    USER_CREATE_FAILURE(10009, "用户创建失败"),
    PASSWORD_MISMATCH(10010, ""),

    EMAIL_ALREADY_EXISTS(11001, ""),
    EMAIL_NOT_FOUND(11002, ""),
    PHONE_NUMBER_ALREADY_EXISTS(11003, ""),
    PHONE_NUMBER_NOT_FOUND(11004, ""),

    TOKEN_EXPIRED(12001, ""),
    TOKEN_INVALID(12002, ""),
    INVALID_SIGNATURE(12003, ""),
    INVALID_TIMESTAMP(12004, ""),
    INVALID_NONCE(12005, ""),

    RESOURCE_NOT_FOUND(30001, ""),

    SYSTEM_ERROR(40001, ""),

    THIRD_PARTY_ERROR(50001, ""),
    BUSINESS_ERROR(50002, ""),
    DATABASE_ERROR(50003, ""),
    NETWORK_ERROR(50004, ""),
    METHOD_NOT_ALLOWED(50005, ""),
    SERVICE_UNAVAILABLE(50006, ""),
    REQUEST_TIMEOUT(50007, "");


    private long code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}