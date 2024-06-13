package top.ytazwc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.ytazwc.spring.config.SpringConfig;
import top.ytazwc.spring.service.ResourceService;

/**
 * @author 花木凋零成兰
 * @title App
 * @date 2024/6/13 23:03
 * @package top.ytazwc.spring
 * @description TODO
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourceService resourceService = ctx.getBean(ResourceService.class);
        boolean flag = resourceService.openURL("http://pan.baidu.com/haha", "   root ");
        System.out.println(flag);
    }
}
