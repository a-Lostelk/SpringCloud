package com.sunny.common;

/**
 * Author: Sunny
 * Date: 2020/2/15
 * Created by: IntelliJ idea
 * Description:
 */
public enum ResultEnum {

    SUCCESS(200, "成功"),
    ERROR(-1, "服务器异常");

    private int status;

    private String msg;

    ResultEnum(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
