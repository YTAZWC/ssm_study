package top.ytazwc.spring;

import top.ytazwc.spring.service.BookService;
import top.ytazwc.spring.service.impl.BookServiceImpl;

/**
 * @author 花木凋零成兰
 * @title App
 * @date 2024/6/10 16:20
 * @package top.ytazwc.spring
 * @description 应用
 */
public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
