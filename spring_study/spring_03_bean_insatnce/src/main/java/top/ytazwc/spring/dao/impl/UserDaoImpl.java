package top.ytazwc.spring.dao.impl;

import top.ytazwc.spring.dao.UserDao;

/**
 * @author 花木凋零成兰
 * @title UserDaoImpl
 * @date 2024/6/10 21:24
 * @package top.ytazwc.spring.dao.impl
 * @description TODO
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("user dao save ...");
    }
}
