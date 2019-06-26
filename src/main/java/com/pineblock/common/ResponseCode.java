package com.pineblock.common;

import com.pineblock.enums.StatusEnums;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: BaoJian.Xu
 * @Date: 2019-06-26 21:09
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class ResponseCode {

    private Integer code;
    private String msg;
    private Object data;

    public ResponseCode(StatusEnums enums , Object data){
        this.code = enums.getCode();
        this.msg = enums.getInfo();
        this.data = data;
    }

    public ResponseCode(StatusEnums enums){
        this.code = enums.getCode();
        this.msg = enums.getInfo();
    }

    public ResponseCode(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public static ResponseCode success(){
        return new ResponseCode(StatusEnums.SUCCESS);
    }

    public static ResponseCode success(Object data){
        return new ResponseCode(StatusEnums.SUCCESS,data);
    }

    public static ResponseCode error(){
        return new ResponseCode(StatusEnums.SYSTEM_ERROR);
    }
}
