package top.ytazwc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.ytazwc.spring.dao.BookDao;

/**
 * @author 花木凋零成兰
 * @title AppForInstanceBook
 * @date 2024/6/10 21:04
 * @package top.ytazwc.spring
 * @description TODO
 */
public class AppForInstanceBook {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
