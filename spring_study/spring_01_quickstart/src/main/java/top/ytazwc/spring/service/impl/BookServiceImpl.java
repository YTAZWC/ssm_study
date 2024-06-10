package top.ytazwc.spring.service.impl;

import top.ytazwc.spring.dao.BookDao;
import top.ytazwc.spring.dao.impl.BookDaoImpl;
import top.ytazwc.spring.service.BookService;

/**
 * @author 花木凋零成兰
 * @title BookServiceImpl
 * @date 2024/6/10 16:24
 * @package top.ytazwc.spring.service.impl
 * @description TODO
 */
public class BookServiceImpl implements BookService {

    private BookDao bookDao = new BookDaoImpl();

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}