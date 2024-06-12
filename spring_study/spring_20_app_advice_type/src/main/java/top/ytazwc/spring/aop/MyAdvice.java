package top.ytazwc.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author 花木凋零成兰
 * @title MyAdvice
 * @date 2024/6/12 22:51
 * @package top.ytazwc.spring.aop
 * @description TODO
 */
@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void top.ytazwc.spring.dao.BookDao.update())")
    private void pointcut() {}

    @Pointcut("execution(int top.ytazwc.spring.dao.BookDao.select())")
    private void pointcut2() {}

//    @Before("pointcut()")
    public void before() {
        System.out.println("before advice ....");
    }

    @After("pointcut2()")
    public void after() {
        System.out.println("after advice ...");
    }

    // @Around("pointcut2()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before advice ...");
        // 表示对原始操作的调用
        Object ret = proceedingJoinPoint.proceed();
        System.out.println("around after advice ...");
        return ret;
    }

    @AfterReturning("pointcut2()")
    public void afterReturning() {
        System.out.println("afterReturning advice ...");
    }

    @AfterThrowing("pointcut2()")
    public void afterThrowing() {
        System.out.println("afterThrowing advice ...");
    }

}
