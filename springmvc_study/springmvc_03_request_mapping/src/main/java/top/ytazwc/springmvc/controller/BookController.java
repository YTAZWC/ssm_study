package top.ytazwc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 花木凋零成兰
 * @title BookController
 * @date 2024/6/24 22:46
 * @package top.ytazwc.springmvc.controller
 * @description TODO
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("book save ...");
        return "{'module':'book save'}";
    }
}
