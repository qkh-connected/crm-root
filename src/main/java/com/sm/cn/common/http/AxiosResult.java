package com.sm.cn.common.http;

import lombok.Data;

@Data
public class AxiosResult<T> {
    private int status;
    private String message;
    private T data;

    private AxiosResult() {
    }

    private AxiosResult(AxiosStatus axiosStatus, T data) {
        this.status = axiosStatus.getStatus();
        this.message = axiosStatus.getMessage();
        this.data = data;
    }
    public static <T> AxiosResult<T> success(){
        return new AxiosResult<>(AxiosStatus.OK,null);
    }
    public static <T> AxiosResult<T> success(T data){
        return new AxiosResult<>(AxiosStatus.OK,data);
    }
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus){
        return new AxiosResult<>(axiosStatus,null);
    }
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus,T data){
        return new AxiosResult<>(axiosStatus,data);
    }


    public static <T> AxiosResult<T> error(){
        return new AxiosResult<>(AxiosStatus.ERROR,null);
    }
    public static <T> AxiosResult<T> error(T data){
        return new AxiosResult<>(AxiosStatus.ERROR,data);
    }
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus){
        return new AxiosResult<>(axiosStatus,null);
    }
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus,T data){
        return new AxiosResult<>(axiosStatus,data);
    }
}
