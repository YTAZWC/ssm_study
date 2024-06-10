package top.ytazwc.spring.dao.impl;

import top.ytazwc.spring.dao.BookDao;

/**
 * @author 花木凋零成兰
 * @title BookDaoImpl
 * @date 2024/6/10 16:21
 * @package top.ytazwc.spring.dao.impl
 * @description TODO
 */
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
