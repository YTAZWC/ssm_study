package top.ytazwc.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author 花木凋零成兰
 * @title MyAdvice
 * @date 2024/6/13 20:32
 * @package top.ytazwc.spring.aop
 * @description TODO
 */
@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* top.ytazwc.spring.dao.BookDao.findName(..))")
    private void pointcut() {}

//    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        // 获取参数
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ...");
    }

//    @After("pointcut()")
    public void after(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice ...");
    }

//    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 666;
        Object result = null;
        try {
            result = joinPoint.proceed(args);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    // 接受返回值
//    @AfterReturning(value = "pointcut()", returning = "arg")
    public void afterReturning(Object arg) {
        System.out.println("afterReturning advice ..." + arg);
    }

    @AfterThrowing(value = "pointcut()", throwing = "throwable")
    public void afterThrowing(Throwable throwable) {
        System.out.println("afterThrowing advice ...");
    }

}
