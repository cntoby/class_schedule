package com.tencent.wxcloudrun.dto;

public enum ResultCodeEnum {

    SUCCESS("00000", "SUCCESSFUL"),
    FAIL("00001", "FAILED"),

    PARAM_VALID_FAILED("100001", "param invalid"),
    ;

    private final String code;
    private final String message;

    ResultCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
