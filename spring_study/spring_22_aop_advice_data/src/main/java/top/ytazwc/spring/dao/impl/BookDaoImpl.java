package top.ytazwc.spring.dao.impl;

import org.springframework.stereotype.Repository;
import top.ytazwc.spring.dao.BookDao;

/**
 * @author 花木凋零成兰
 * @title BookDaoImpl
 * @date 2024/6/13 20:30
 * @package top.ytazwc.spring.dao.impl
 * @description TODO
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id) {
        System.out.println("id: " + id);
        return "ytazwc";
    }
}
