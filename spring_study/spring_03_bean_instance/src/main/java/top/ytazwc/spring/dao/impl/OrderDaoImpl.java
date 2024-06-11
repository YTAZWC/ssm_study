package top.ytazwc.spring.dao.impl;

import top.ytazwc.spring.dao.OrderDao;

/**
 * @author 花木凋零成兰
 * @title OrderDaoImpl
 * @date 2024/6/10 21:12
 * @package top.ytazwc.spring.dao.impl
 * @description TODO
 */
public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("order dao save ...");
    }
}
