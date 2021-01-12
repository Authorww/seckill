package com.baizhi.secondkill.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseBean {
    private int code;
    private String message;
    private Object obj;

    //创建返回值 没有参数的返回
    public static ResponseBean success() {
        return new ResponseBean(CommonPara.SUCCESS.getCode(),CommonPara.SUCCESS.getMessage(),null);
    }
    // 创建带对象的返回
    public static ResponseBean success(Object obj) {
        return new ResponseBean(CommonPara.SUCCESS.getCode(),CommonPara.SUCCESS.getMessage(),obj);
    }
    //创建返回值 没有参数的返回
    public static ResponseBean error() {
        return new ResponseBean(CommonPara.ERROR.getCode(),CommonPara.SUCCESS.getMessage(),null);
    }
    //创建带对象的返回
    public static ResponseBean error(Object obj) {
        return new ResponseBean(CommonPara.ERROR.getCode(),CommonPara.SUCCESS.getMessage(),obj);
    }
}
