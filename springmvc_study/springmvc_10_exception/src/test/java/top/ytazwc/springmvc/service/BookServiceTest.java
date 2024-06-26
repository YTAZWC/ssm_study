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

    @Test
    public void testDelete() {
        bookService.delete(2);
    }

    @Test
    public void testUpdate() {
        Book book = new Book(3, "百那些手小集术", "方杰", "你入万总民元满程业参类来京包日。及联济北毛力标容育听生眼。合存千号带族共置日即且所。省得加头八自安除科认飞业许院。");
        bookService.update(book);
    }

}
