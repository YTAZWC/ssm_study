package top.ytazwc.boot.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.ytazwc.boot.domain.Book;

import java.util.List;

/**
 * @author yt
 * 2024/6/29
 */
@SpringBootTest
public class BookServiceTests {

    @Autowired
    private BookService bookService;

    @Test
    public void testGetById() {
        Book book = bookService.getById(4);
        System.out.println(book);
    }

    @Test
    public void testGetAll() {
        List<Book> list =  bookService.getAll();
        System.out.println(list.toString());
    }

}
