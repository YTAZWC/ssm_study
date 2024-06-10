package top.ytazwc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.ytazwc.spring.dao.OrderDao;

/**
 * @author 花木凋零成兰
 * @title AppForInstanceOrder
 * @date 2024/6/10 21:13
 * @package top.ytazwc.spring
 * @description TODO
 */
public class AppForInstanceOrder {
    public static void main(String[] args) {
        // 通过静态工厂创建对象
//        OrderDao orderDao = OrderDaoFactory.getOrderDao();
//        orderDao.save();

        // 通过Spring IoC 管理bean
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");
        orderDao.save();

    }
}
