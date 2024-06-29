package top.ytazwc.boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.ytazwc.boot.service.BookService;

@SpringBootTest
class TestApplicationTests {
    @Autowired
    private BookService bookService;

    @Test
    void saveTest() {
        bookService.save();
    }
}