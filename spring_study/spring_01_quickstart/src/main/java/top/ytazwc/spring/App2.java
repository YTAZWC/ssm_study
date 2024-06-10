package top.ytazwc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.ytazwc.spring.dao.BookDao;
import top.ytazwc.spring.service.BookService;

/**
 * @author 花木凋零成兰
 * @title App2
 * @date 2024/6/10 16:39
 * @package top.ytazwc.spring
 * @description TODO
 */
public class App2 {
    public static void main(String[] args) {
        // 获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取bean
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
