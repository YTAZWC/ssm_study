package top.ytazwc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 花木凋零成兰
 * @title UserController
 * @date 2024/6/24 23:05
 * @package top.ytazwc.springmvc.controller
 * @description 用户表现层
 */
@Controller
@RequestMapping("/user")
public class UserController {
    // 普通参数
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name, int age) {
        System.out.println("普通参数传递 name ==> " + name);
        System.out.println("普通参数传递 age ==> " + age);
        return "{'module':'common param'}";
    }
}
