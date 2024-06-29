package top.ytazwc.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.ytazwc.boot.domain.Book;
import top.ytazwc.boot.domain.result.codes.ResponseCode;
import top.ytazwc.boot.domain.result.Result;
import top.ytazwc.boot.service.BookService;

import java.util.List;

/**
 * @author yt
 * 2024/6/26
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result<Boolean> save(@RequestBody Book book) {
        boolean result = bookService.save(book);
        if (result) {
            return Result.success(ResponseCode.SAVE_OK.getCode(), "新增成功!");
        } else {
            return Result.fail(ResponseCode.SAVE_ERR.getCode(), "新增失败!");
        }
    }

    @PutMapping
    public Result<Boolean> update(@RequestBody Book book) {
        boolean result = bookService.update(book);
        if (result) {
            return Result.success(ResponseCode.UPDATE_OK.getCode(), "更新成功!");
        } else {
            return Result.fail(ResponseCode.UPDATE_ERR.getCode(),"更新失败!");
        }
    }

    @DeleteMapping("/{id}")
    public Result<Boolean> delete(@PathVariable("id") Integer id) {
        boolean result = bookService.delete(id);
        if (result) {
            return Result.success(ResponseCode.DELETE_OK.getCode(), "删除成功! 图书id: " + id);
        } else {
            return Result.fail(ResponseCode.DELETE_ERR.getCode(), "删除失败! 图书id: " + id);
        }
    }

    @GetMapping("/{id}")
    public Result<Book> getById(@PathVariable("id") Integer id) {
        Book book = bookService.getById(id);
        if (book != null) {
            return Result.success(ResponseCode.GET_OK.getCode(), book);
        } else {
            return Result.fail(ResponseCode.GET_ERR.getCode(), "获取图书失败!图书id:" + id);
        }
    }

    @GetMapping
    public Result<List<Book>> getAll() {
        List<Book> books = bookService.getAll();
        if (books != null) {
            return Result.success(ResponseCode.GET_OK.getCode(), books);
        } else {
            return Result.fail(ResponseCode.GET_ERR.getCode(), "获取所有图书失败!");
        }
    }

}
