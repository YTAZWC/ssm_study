package top.ytazwc.spring.dao.impl;

import org.springframework.stereotype.Repository;
import top.ytazwc.spring.dao.BookDao;

/**
 * @author 花木凋零成兰
 * @title BookDaoImpl
 * @date 2024/6/11 22:17
 * @package top.ytazwc.spring.dao.impl
 * @description TODO
 */
@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...2");
    }
}
