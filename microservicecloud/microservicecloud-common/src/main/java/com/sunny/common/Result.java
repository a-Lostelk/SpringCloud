package com.sunny.common;

/**
 * @Author: Sunny
 * @Date: 2020/2/18
 * @Created by: IntelliJ idea
 * @Description:
 */
public class Result<T> {

    /**
     * 状态码
     */
    private int code;

    /**
     * 状态信息
     */
    private String message;

    /**
     * 传输数据
     */
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result() {
    }

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
