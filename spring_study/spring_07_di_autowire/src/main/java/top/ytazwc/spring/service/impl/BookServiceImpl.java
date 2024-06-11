package top.ytazwc.spring.service.impl;

import top.ytazwc.spring.dao.BookDao;
import top.ytazwc.spring.service.BookService;

/**
 * @author yt
 * 2024/6/11
 */
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service dao ...");
        bookDao.save();
    }
}
