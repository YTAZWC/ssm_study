package top.ytazwc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yt
 * 2024/6/24
 */
@Controller // 定义表现层bean
public class UserController {

    @RequestMapping("/save")    // 设置当前操作访问路径
    @ResponseBody    // 设置当前操作返回值 为操作响应内容
    public String save() {
        System.out.println("user save ...");
        return "{'module':'springmvc'}";
    }

}
