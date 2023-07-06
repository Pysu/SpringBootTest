package com.example.springboottest.common;

import lombok.Data;

@Data
public class RestResult<T> {
    private T data;

    private String code;

    private String message;

    public RestResult() {}

    public RestResult(String code) {
        this.code = code;
    }

    public RestResult(T data, String code) {
        this.data = data;
        this.code = code;
    }

    public RestResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public RestResult(T data, String code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public static RestResult success() {
        return new RestResult("success");
    }

    public static RestResult success(Object t) {
        return new RestResult(t, "success");
    }

    public static RestResult fail() {
        return new RestResult("fail");
    }

    public static RestResult fail(String message) {
        return new RestResult("fail", message);
    }
}
