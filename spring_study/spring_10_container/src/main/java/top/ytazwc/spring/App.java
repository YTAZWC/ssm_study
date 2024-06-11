package top.ytazwc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import top.ytazwc.spring.dao.BookDao;

/**
 * @author yt
 * 2024/6/11
 */
public class App {
    public static void main(String[] args) {
        // 1、加载类路径下的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2、从文件系统下加载配置文件
        ApplicationContext ctx2 = new FileSystemXmlApplicationContext("E:\\workspace\\ssm_study\\spring_study\\spring_10_container\\src\\main\\resources\\applicationContext.xml");
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        // 不需要强转
//        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
        // 按类型找
        BookDao bookDao = ctx.getBean(BookDao.class);

        bookDao.save();
    }
}
