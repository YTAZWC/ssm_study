package top.ytazwc.springmvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.ytazwc.springmvc.config.SpringConfig;
import top.ytazwc.springmvc.controller.UserController;

/**
 * @author yt
 * 2024/6/24
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(ctx.getBean(UserController.class));
    }
}
