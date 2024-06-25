package top.ytazwc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.ytazwc.springmvc.domain.User;

/**
 * @author 花木凋零成兰
 * @title UserController
 * @date 2024/6/25 23:09
 * @package top.ytazwc.springmvc
 * @description User 表现层
 */
@Controller
public class UserController {

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public String save(@RequestBody User user) {
        System.out.println("user save..." + user);
        return "{'module':'user save'}";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable("id") Integer id) {
        System.out.println("user delete..." + id);
        return "{'module':'user delete'}";
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user) {
        System.out.println("user update..." + user);
        return "{'module':'user update'}";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable("id") Integer id) {
        System.out.println("user getById..." + id);
        return "{'module':'user getById'}";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public String getAll() {
        System.out.println("user getAll...");
        return "{'module':'user getAll'}";
    }

}
