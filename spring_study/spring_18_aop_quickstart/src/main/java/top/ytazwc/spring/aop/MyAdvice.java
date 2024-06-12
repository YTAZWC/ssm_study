package top.ytazwc.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 花木凋零成兰
 * @title MyAdvice
 * @date 2024/6/12 19:37
 * @package top.ytazwc.spring.aop
 * @description TODO
 */
@Component  // 变成bean组件
@Aspect // AOP 处理注解
public class MyAdvice {
    @Pointcut("execution(void top.ytazwc.spring.dao.BookDao.update())")
    private void pointcut() {}

    @Before("pointcut()")   // 在切入点之前
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
