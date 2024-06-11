package top.ytazwc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.ytazwc.spring.config.SpringConfig;
import top.ytazwc.spring.dao.BookDao;
import top.ytazwc.spring.service.BookService;

/**
 * @author 花木凋零成兰
 * @title AppForAnnotation
 * @date 2024/6/11 20:43
 * @package top.ytazwc.spring
 * @description 通过纯注解获取bean
 */
public class AppForAnnotation {
    public static void main(String[] args) {
        //1. 加载配置类
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);

        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
