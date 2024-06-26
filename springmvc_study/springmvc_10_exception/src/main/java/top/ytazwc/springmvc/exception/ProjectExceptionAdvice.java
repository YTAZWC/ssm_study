package top.ytazwc.springmvc.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.ytazwc.springmvc.result.Result;

/**
 * @author 花木凋零成兰
 * @title ProjectExceptionAdvice
 * @date 2024/6/26 23:16
 * @package top.ytazwc.springmvc.exception
 * @description 项目统一异常处理
 */
@RestControllerAdvice   // 表示处理REST风格的Controller
public class ProjectExceptionAdvice {
    @ExceptionHandler(Exception.class)  // 指定处理异常类型
    public Result<String> doException(Exception e) {
        System.out.println("异常!抓到你啦~~~~~");
        return Result.fail(666, e.getMessage() + " 异常发生位置: " + e.getStackTrace()[0]);
    }
}
