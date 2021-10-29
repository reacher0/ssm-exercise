package com.reacher.util;

public enum ResultCode {

    SUCCESS(200,"成功"),
    PARAM_ERROR(1000,"参数错误"),
    USER_NOT_lOGIN(2001,"用户未登录"),
    USER_NOT_EXIST(2003,"用户不存在"),
    SERVER_ERROR(4000,"服务端错误");

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
