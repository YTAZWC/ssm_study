package top.ytazwc.springmvc.controller;

import org.springframework.web.bind.annotation.*;
import top.ytazwc.springmvc.domain.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yt
 * 2024/6/26
 */
@RestController
@RequestMapping("/books")
public class BookController {

    // 保存
    @PostMapping
    public String save(@RequestBody Book book) {
        System.out.println("book save ==> " + book);
        return "{'module':'book save success'}";
    }

    // 查询全部
    @GetMapping
    public List<Book> getAll() {

        System.out.println("book getAll is running ...");

        Book book1 = new Book(0, "历史", "明朝那些事儿", "学习明朝历史");
        Book book2 = new Book(0, "计算机", "SpringMVC入门教程", "小试牛刀");
        Book book3 = new Book(0, "计算机", "SpringMVC实战教程", "一代宗师");
        Book book4 = new Book(0, "计算机", "SpringMVC实战教程进阶", "一代宗师呕心沥血之作");
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        return books;
    }

}
