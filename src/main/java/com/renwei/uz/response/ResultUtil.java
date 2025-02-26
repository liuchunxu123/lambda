package com.renwei.uz.response;

import org.springframework.util.CollectionUtils;

import java.util.Collection;

/**
 * @ClassName: ResultUtil
 * @Description:TODO(ここではこのような役割を一言で説明します)
 * @author: liuxianbin
 * @date: 2020年1月15日 上午10:38:27
 */
public class ResultUtil {

    private final static String SUCCESS = "success";

    public static <T> ResultData<T> success() {
        return new ResultData<T>().setCode(ResultCode.SUCCESS).setMsg(SUCCESS);
    }

    public static <T> ResultData<T> success(T data) {
        return new ResultData<T>().setCode(ResultCode.SUCCESS).setMsg(SUCCESS).setData(data);
    }

    public static <T> ResultData<T> error(String message) {
        return new ResultData<T>().setCode(ResultCode.FAIL).setMsg(message);
    }

    public static <T> ResultData<T> resultData(T data) {
        if (data instanceof Collection){
            Collection collection = (Collection)data;
            if (CollectionUtils.isEmpty(collection)){
                return new ResultData<T>().setCode(ResultCode.FAIL).setMsg("data is empty");
            } else {
                return new ResultData<T>().setCode(ResultCode.SUCCESS).setMsg(SUCCESS).setData(data);
            }
        } else if (data == null){
            return new ResultData<T>().setCode(ResultCode.FAIL).setMsg("data is null");
        } else {
            return new ResultData<T>().setCode(ResultCode.SUCCESS).setMsg(SUCCESS).setData(data);
        }
    }

    public static <T> ResultData<T> resultData(int code, String message) {
        return new ResultData<T>().setCode(code).setMsg(message);
    }

    public static <T> ResultData<T> resultData(int code, String message, T t) {
        return new ResultData<T>().setCode(code).setMsg(message).setData(t);
    }

}
