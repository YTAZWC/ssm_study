package top.ytazwc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.ytazwc.springmvc.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 花木凋零成兰
 * @title UserController
 * @date 2024/6/25 21:55
 * @package top.ytazwc.springmvc.controller
 * @description 用户 表现层
 */
@Controller
public class UserController {
    // 响应页面/跳转页面
    @RequestMapping("/toJumpPage")
    public String toJumpPage() {
        System.out.println("跳转页面");
        return "page.jsp";
    }

    // 响应文本数据
    @RequestMapping("/toText")
    @ResponseBody   // 请求响应体 为方法返回结果字符串
    public String toText() {
        System.out.println("返回纯文本数据");
        return "response.txt";
    }

    // 响应POJO对象
    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo() {
        System.out.println("返回json对象数据");
        return new User("ytazwc", 22);
    }

    // 响应POJO集合对象
    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList() {
        System.out.println("返回json集合数据");
        User user1 = new User("ytazwc", 22);
        User user2 = new User("yt", 21);
        User user3 = new User("zwc", 21);

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }

}
