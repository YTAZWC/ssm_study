package top.ytazwc.springmvc.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.ytazwc.springmvc.enums.CommonCode;
import top.ytazwc.springmvc.exception.BusinessException;
import top.ytazwc.springmvc.exception.SystemException;
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

    @ExceptionHandler(SystemException.class)
    public Result<String> doSystemException(SystemException e) {
        // 1. 记录日志
        System.out.println("捕获到系统异常...");
        // 2. 发送消息给运维
        // 3. 发送邮件给开发人员；需要将消息发送给开发人员
        return Result.fail(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result<String> doBusinessException(BusinessException e) {
        // 1. 记录日志
        System.out.println("捕获到业务异常...");
        // 2. 发送消息给运维
        // 3. 发送邮件给开发人员
        return Result.fail(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(Exception.class)  // 指定处理异常类型
    public Result<String> doException(Exception e) {
        // 1. 记录日志
        System.out.println("捕获到其他异常...");
        // 2. 发送消息给运维
        // 3. 发送邮件给开发人员
        return Result.fail(CommonCode.SYSTEM_UNKNOWN_ERR.getCode(), "系统繁忙,请稍后再试!");
    }
}
