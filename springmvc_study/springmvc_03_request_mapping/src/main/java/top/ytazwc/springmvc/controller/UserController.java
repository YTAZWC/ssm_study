package top.ytazwc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 花木凋零成兰
 * @title UserController
 * @date 2024/6/24 22:46
 * @package top.ytazwc.springmvc.controller
 * @description 用户表现层
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("user save ...");
        return "{'module':'user save'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete() {
        System.out.println("user delete ...");
        return "{'module':'user delete'}";
    }

}
