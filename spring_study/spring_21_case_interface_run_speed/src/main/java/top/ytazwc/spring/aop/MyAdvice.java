package top.ytazwc.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author yt
 * 2024/6/13
 */
@Component
@Aspect
public class MyAdvice {

    // 匹配业务层的所有方法
    @Pointcut("execution(* top.ytazwc.spring.service.*Service.*(..))")
    private void servicePt() {}

    @Around("servicePt()")
    public Object runSpeed(ProceedingJoinPoint jointPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = null;
        // 封装一次执行的信息
        Signature signature = jointPoint.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        for (int i = 0; i < 10000; i++) {
            result = jointPoint.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("万次执行: " + className + "." + methodName + "方法,花费时间:" + (end-start) + "ms");
        return result;
    }

}
