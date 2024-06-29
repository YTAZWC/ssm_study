package top.ytazwc.boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.ytazwc.boot.dao.BookMapper;
import top.ytazwc.boot.domain.Book;

@SpringBootTest
class SsmApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void getByIdTest() {
        Book book = bookMapper.getById(4);
        System.out.println(book);
    }

}
