package com.baizhi.vo;

import com.baizhi.secondkill.util.CommonPara;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseMSG {
    private static long code;
    private static String message;
    private Object obj;

    public ResponseMSG(long code, String message, Object o) {
    }

    public static ResponseMSG success(){
        return new ResponseMSG(CommonPara.SUCCESS.getCode(),CommonPara.SUCCESS.getMessage(),null);
    }
    public static ResponseMSG success(Object obj){
        return new ResponseMSG(CommonPara.SUCCESS.getCode(),CommonPara.SUCCESS.getMessage(),obj);
    }
    public static ResponseMSG error(){
        return new ResponseMSG(CommonPara.ERROR.getCode(),CommonPara.ERROR.getMessage(),null);
    }
    public static ResponseMSG error(Object obj){
        return new ResponseMSG(CommonPara.ERROR.getCode(),CommonPara.ERROR.getMessage(),obj);
    }
}
