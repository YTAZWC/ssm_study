package top.ytazwc.spring.dao.impl;

import top.ytazwc.spring.dao.BookDao;

/**
 * @author 花木凋零成兰
 * @title BookDaoImpl
 * @date 2024/6/10 22:15
 * @package top.ytazwc.spring.dao.impl
 * @description TODO
 */
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save...");
    }
    // 表示bean初始化对应的操作
    public void init() {
        System.out.println("init...");
    }
    // 表示bean销毁前对应的操作
    public void destroy() {
        System.out.println("destroy...");
    }

}
