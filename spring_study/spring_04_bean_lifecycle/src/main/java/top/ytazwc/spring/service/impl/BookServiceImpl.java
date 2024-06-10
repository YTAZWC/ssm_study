package top.ytazwc.spring.service.impl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import top.ytazwc.spring.dao.BookDao;
import top.ytazwc.spring.service.BookService;

/**
 * @author 花木凋零成兰
 * @title BookServiceImpl
 * @date 2024/6/10 22:16
 * @package top.ytazwc.spring.service.impl
 * @description TODO
 */
public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        System.out.println("set ... ");
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init ...");
    }
}
