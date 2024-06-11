package top.ytazwc.spring.dao.impl;

import top.ytazwc.spring.dao.UserDao;

/**
 * @author yt
 * 2024/6/11
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("user dao save ...");
    }
}
