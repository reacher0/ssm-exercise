package com.reacher.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResultVo {
    private int code;
    private String msg;
    private Object data;

    public ResultVo(ResultCode resultCode,Object data){
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }

    public static ResultVo success(){
        return new ResultVo(ResultCode.SUCCESS,null);
    }

    public static ResultVo success(Object data){
        return new ResultVo(ResultCode.SUCCESS,data);
    }

    public static ResultVo fail(ResultCode resultCode){
        return new ResultVo(resultCode,null);
    }

    public static ResultVo fail(ResultCode resultCode,Object data){
        return new ResultVo(resultCode,data);
    }
}
