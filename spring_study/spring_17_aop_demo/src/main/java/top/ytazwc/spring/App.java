package top.ytazwc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.ytazwc.spring.config.SpringConfig;
import top.ytazwc.spring.dao.BookDao;

/**
 * @author 花木凋零成兰
 * @title App
 * @date 2024/6/12 15:29
 * @package top.ytazwc.spring
 * @description AOP demo
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.delete();
    }
}
