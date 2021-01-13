package com.baizhi.secondkill.util;

public enum CommonPara {
    SUCCESS (200,"success"),
    MOBILE_ERROR(500212,"手机号码格式错误"),
    PSSQWORD_ERROR(500213,"登录密码输入错误"),
    LOGINVO_ERROR(500214,"手机号码格式错误"),
    BIND_ERROR(500215,"绑定异常"),
    ERROR(500,"登陆出现异常");


    private int code;
    private String message;

    CommonPara(int code, String message) {
        this.code = code;
        this.message = message;
    }
    CommonPara(int code) {
        this.code = code;
    }
    CommonPara(String message) {
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
