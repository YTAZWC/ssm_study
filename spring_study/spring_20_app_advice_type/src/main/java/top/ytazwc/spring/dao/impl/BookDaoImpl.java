package top.ytazwc.spring.dao.impl;

import org.springframework.stereotype.Repository;
import top.ytazwc.spring.dao.BookDao;

/**
 * @author 花木凋零成兰
 * @title BookDaoImpl
 * @date 2024/6/12 22:46
 * @package top.ytazwc.top.dao.impl
 * @description TODO
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void update() {
        System.out.println("book update dao ...");
    }

    @Override
    public int select() {
        System.out.println("book select dao ...");
//        int x = 1/0;
        return 100;
    }
}
