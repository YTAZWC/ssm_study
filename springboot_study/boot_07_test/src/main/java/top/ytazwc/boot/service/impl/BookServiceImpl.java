package top.ytazwc.boot.service.impl;

import org.springframework.stereotype.Service;
import top.ytazwc.boot.service.BookService;

/**
 * @author yt
 * 2024/6/29
 */
@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service is running ...");
    }
}
