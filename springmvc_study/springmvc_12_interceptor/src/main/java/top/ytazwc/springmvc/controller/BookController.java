package top.ytazwc.springmvc.controller;

import org.springframework.web.bind.annotation.*;
import top.ytazwc.springmvc.domain.Book;

/**
 * @author yt
 * 2024/6/27
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book) {
        System.out.println("book save ..." + book);
        return "{'module':'book save'}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Integer id) {
        System.out.println("book delete ..." + id);
        return "{'module':'book delete'}";
    }

    @PutMapping
    public String update(@RequestBody Book book) {
        System.out.println("book update ..." + book);
        return "{'module':'book update'}";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") Integer id) {
        System.out.println("book getById ..." + id);
        return "{'module':'book getById'}";
    }

    @GetMapping
    public String getAll() {
        System.out.println("book getAll ...");
        return "{'module':'book getAll'}";
    }

}
