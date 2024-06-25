package top.ytazwc.springmvc.controller;

import org.springframework.web.bind.annotation.*;
import top.ytazwc.springmvc.domain.Book;

/**
 * @author 花木凋零成兰
 * @title BookController
 * @date 2024/6/25 23:13
 * @package top.ytazwc.springmvc.controller
 * @description Book 表现层
 */
@RestController
@RequestMapping("/books")
public class BookController {
//    @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save..." + book);
        return "{'module':'book save'}";
    }

//    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("book delete..." + id);
        return "{'module':'book delete'}";
    }

//    @RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public String update(@RequestBody Book book){
        System.out.println("book update..." + book);
        return "{'module':'book update'}";
    }

//    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @GetMapping("{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("book getById..." + id);
        return "{'module':'book getById'}";
    }

//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String getAll(){
        System.out.println("book getAll...");
        return "{'module':'book getAll'}";
    }
}
