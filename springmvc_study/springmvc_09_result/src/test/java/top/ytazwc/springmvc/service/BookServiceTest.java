package top.ytazwc.springmvc.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.ytazwc.springmvc.config.SpringConfig;
import top.ytazwc.springmvc.domain.Book;

import java.util.List;

/**
 * @author yt
 * 2024/6/26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testGetById() {
        Book book = bookService.getById(2);
        System.out.println(book);
    }

    @Test
    public void testGetAll() {
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }

}
