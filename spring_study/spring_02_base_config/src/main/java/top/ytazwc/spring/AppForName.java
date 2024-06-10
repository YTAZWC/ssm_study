package top.ytazwc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.ytazwc.spring.service.BookService;

/**
 * @author 花木凋零成兰
 * @title AppForName
 * @date 2024/6/10 16:39
 * @package top.ytazwc.spring
 * @description 通过bean的别名获取bean
 */
public class AppForName {
    public static void main(String[] args) {
        // 获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取bean
        BookService bookService = (BookService) ctx.getBean("service");
        bookService.save();
    }
}
