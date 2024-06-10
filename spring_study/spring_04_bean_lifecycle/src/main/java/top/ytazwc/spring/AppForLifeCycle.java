package top.ytazwc.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.ytazwc.spring.dao.BookDao;

/**
 * @author 花木凋零成兰
 * @title AppForLifeCycle
 * @date 2024/6/10 23:01
 * @package top.ytazwc.spring
 * @description TODO
 */
public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 注册关闭容器的钩子，容器在启动以后，如果要关闭虚拟机，则先关闭容器
        ctx.registerShutdownHook();

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
//        ctx.close();
    }
}
