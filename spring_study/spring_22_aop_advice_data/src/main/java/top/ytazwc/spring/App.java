package top.ytazwc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.ytazwc.spring.config.SpringConfig;
import top.ytazwc.spring.dao.BookDao;

/**
 * @author 花木凋零成兰
 * @title App
 * @date 2024/6/13 20:28
 * @package top.ytazwc.spring
 * @description Spring AOP 根据通知获取数据
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        String name = bookDao.findName(100);
        System.out.println(name);
    }
}
