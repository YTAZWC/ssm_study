package top.ytazwc.spring.service.impl;

import top.ytazwc.spring.dao.BookDao;
import top.ytazwc.spring.service.BookService;

/**
 * @author 花木凋零成兰
 * @title BookServiceImpl
 * @date 2024/6/10 16:24
 * @package top.ytazwc.spring.service.impl
 * @description TODO
 */
public class BookServiceImpl implements BookService {
    // 5. 删除业务层中使用new方式创建的dao对象
//    private BookDao bookDao = new BookDaoImpl();
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    // 6. 提供对应set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}