package top.ytazwc.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 花木凋零成兰
 * @title DataAdvice
 * @date 2024/6/13 23:28
 * @package top.ytazwc.spring.aop
 * @description TODO
 */
@Component
@Aspect
public class DataAdvice {
    @Pointcut("execution(boolean top.ytazwc.spring.service.*Service.*(*,*))")
    private void servicePt() {}

    @Around("servicePt()")
    public Object trimStr(ProceedingJoinPoint point) throws Throwable {
        Object[] args = point.getArgs();
        for (int i = 0; i < args.length; i++) {
            // 判断参数是不是字符串
            if (args[i] instanceof String) {
                args[i] = args[i].toString().trim();
            }
        }
        return point.proceed(args);
    }

}
