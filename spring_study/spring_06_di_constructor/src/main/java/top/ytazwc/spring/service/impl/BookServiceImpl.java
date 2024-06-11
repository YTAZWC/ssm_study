package top.ytazwc.spring.service.impl;

import top.ytazwc.spring.dao.BookDao;
import top.ytazwc.spring.dao.UserDao;
import top.ytazwc.spring.service.BookService;

/**
 * @author yt
 * 2024/6/11
 */
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    private UserDao userDao;

//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("book service dao ...");
        bookDao.save();
        userDao.save();
    }
}
