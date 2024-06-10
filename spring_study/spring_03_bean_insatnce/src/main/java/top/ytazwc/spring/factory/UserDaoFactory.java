package top.ytazwc.spring.factory;

import top.ytazwc.spring.dao.UserDao;
import top.ytazwc.spring.dao.impl.UserDaoImpl;

/**
 * @author 花木凋零成兰
 * @title UserDaoFactory
 * @date 2024/6/10 21:24
 * @package top.ytazwc.spring.factory
 * @description TODO
 */
public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
