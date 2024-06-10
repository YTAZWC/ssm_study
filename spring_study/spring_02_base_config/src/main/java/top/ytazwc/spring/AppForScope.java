package top.ytazwc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.ytazwc.spring.dao.BookDao;

/**
 * @author 花木凋零成兰
 * @title AppForScope
 * @date 2024/6/10 17:11
 * @package top.ytazwc.spring
 * @description bean的作用范围
 * bean造出的对象是否为单例；默认单例
 */
public class AppForScope {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao1);

        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao2);
    }
}
