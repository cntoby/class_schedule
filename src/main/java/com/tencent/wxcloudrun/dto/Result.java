package com.tencent.wxcloudrun.dto;

import com.google.gson.Gson;
import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    static public Result<Object> SUCCESS = new Result<>(ResultCodeEnum.SUCCESS);
    static public Result<Object> FAIL = new Result<>(ResultCodeEnum.FAIL);

    /**
     * 返回代码
     */
    private String code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 结果数据
     */
    private T data;

    public Result(ResultCodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMessage();
    }

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Result<T> success() {
        return new Result<>(SUCCESS.getCode(), SUCCESS.getMessage());
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(SUCCESS.getCode(), SUCCESS.getMessage(), data);
    }

    public static <T> Result<T> fail() {
        return new Result<>(FAIL.getCode(), FAIL.getMessage());
    }

    public static <T> Result<T> fail(String message) {
        return new Result<>(FAIL.getCode(), message);
    }

    public static <T> Result<T> fail(String code, String message) {
        return new Result<>(code, message);
    }

    public String toString() {
        return new Gson().toJson(this);
    }

}
