package top.ytazwc.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 花木凋零成兰
 * @title MyAdvice
 * @date 2024/6/12 20:15
 * @package top.ytazwc.spring.aop
 * @description TODO
 */
@Component
@Aspect
public class MyAdvice {
//    @Pointcut("execution(void top.ytazwc.spring.dao.BookDao.update())")
//    @Pointcut("execution(void top.ytazwc.spring.dao.impl.BookDaoImpl.update())")
//    @Pointcut("execution(* top.ytazwc.spring.dao.impl.BookDaoImpl.update(..))")
//    @Pointcut("execution(* *..*(..))")
    @Pointcut("execution(* *..*e(..))")
    private void pt() {}

    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
