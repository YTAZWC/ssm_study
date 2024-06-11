package top.ytazwc.spring.factory;

import top.ytazwc.spring.dao.OrderDao;
import top.ytazwc.spring.dao.impl.OrderDaoImpl;

/**
 * @author 花木凋零成兰
 * @title OrderDaoFactory
 * @date 2024/6/10 21:12
 * @package top.ytazwc.spring.factory
 * @description TODO
 */
public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
//        System.out.println("factory setup ...");
        return new OrderDaoImpl();
    }
}
