package top.ytazwc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.ytazwc.springmvc.domain.User;

import java.util.Arrays;
import java.util.List;

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

    // 普通参数：请求参数名与形参名不同
    @RequestMapping("/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String username, int age) {
        System.out.println("普通参数传递 username ==> " + username);
        System.out.println("普通参数传递 age ==> " + age);
        return "{'module':'common param different name'}";
    }

    // POJO 参数
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user) {
        System.out.println("POJO参数传递 user ==> " + user);
        return "{'module':'pojo param'}";
    }

    // 嵌套POJO参数
    @RequestMapping("/pojoContainPojoParam")
    @ResponseBody
    public String pojoContainPojoParam(User user) {
        System.out.println("POJO嵌套POJO参数传递 user ==> " + user);
        return "{'module':'pojo contain pojo param'}";
    }

    // 数组参数
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes) {
        System.out.println("数组参数传递 likes ==> " + Arrays.toString(likes));
        return "{'module':'array param'}";
    }

    // 集合参数
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes) {
        System.out.println("集合参数传递 likes ==> " + likes);
        return "'module':'list param'";
    }

}
