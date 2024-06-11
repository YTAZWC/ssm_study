package top.ytazwc.spring.dao.impl;

import top.ytazwc.spring.dao.BookDao;

/**
 * @author yt
 * 2024/6/11
 */
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
