package top.ytazwc.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import top.ytazwc.spring.dao.BookDao;
import top.ytazwc.spring.service.BookService;

/**
 * @author 花木凋零成兰
 * @title BookServiceImpl
 * @date 2024/6/11 22:18
 * @package top.ytazwc.spring.service.impl
 * @description TODO
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    @Qualifier("bookDao")  // 若有相同类型的bean；则该注解按名称指定注入的bean
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
