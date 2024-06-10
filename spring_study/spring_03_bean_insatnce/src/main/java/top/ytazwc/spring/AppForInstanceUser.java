package top.ytazwc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.ytazwc.spring.dao.UserDao;

/**
 * @author 花木凋零成兰
 * @title AppForInstanceUser
 * @date 2024/6/10 21:25
 * @package top.ytazwc.spring
 * @description TODO
 */
public class AppForInstanceUser {
    public static void main(String[] args) {
        // 通过实例化工厂获取实例对象
        // 创建实例化工厂
//        UserDaoFactory userDaoFactory = new UserDaoFactory();
//        // 通过实例工厂对象创建对象
//        UserDao userDao = userDaoFactory.getUserDao();
//        userDao.save();

        // Spring配置实例化工厂 管理bean
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) ctx.getBean("userDao");
        userDao.save();
        System.out.println(userDao);
        System.out.println(ctx.getBean("userDao"));
    }
}
