package top.ytazwc.springmvc.controller;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 花木凋零成兰
 * @title Result
 * @date 2024/6/26 22:21
 * @package top.ytazwc.springmvc.controller
 * @description TODO
 */
@Data
@NoArgsConstructor
public class Result<T> {
    private T data;
    private Integer code;
    private String msg;

    public Result(T data, Integer code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(T data, Integer code) {
        this.data = data;
        this.code = code;
    }

    public static <T> Result<T> success(Integer code, T data, String msg) {
        return new Result<>(data, code, msg);
    }

    public static <T> Result<T> success(Integer code, T data) {
        return new Result<>(data, code);
    }

    public static <T> Result<T> fail(Integer code, T data, String msg) {
        return new Result<>(data, code, msg);
    }

    public static <T> Result<T> fail(Integer code, String msg) {
        return new Result<>(code, msg);
    }

}
