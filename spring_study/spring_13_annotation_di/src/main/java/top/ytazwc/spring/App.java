package top.ytazwc.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.ytazwc.spring.config.SpringConfig;
import top.ytazwc.spring.service.BookService;

/**
 * @author 花木凋零成兰
 * @title App
 * @date 2024/6/11 22:16
 * @package top.ytazwc.spring
 * @description TODO
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
    }
}
