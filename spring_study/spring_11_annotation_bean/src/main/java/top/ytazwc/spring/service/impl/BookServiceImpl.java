package top.ytazwc.spring.service.impl;

import org.springframework.stereotype.Service;
import top.ytazwc.spring.service.BookService;

/**
 * @author 花木凋零成兰
 * @title BookServiceImpl
 * @date 2024/6/11 20:18
 * @package top.ytazwc.spring.service.impl
 * @description TODO
 */
//@Component
@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service save ...");
    }
}
