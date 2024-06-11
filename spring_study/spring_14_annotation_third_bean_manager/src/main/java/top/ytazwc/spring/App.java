package top.ytazwc.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.ytazwc.spring.config.SpringConfig;

import javax.sql.DataSource;

/**
 * @author 花木凋零成兰
 * @title App
 * @date 2024/6/11 23:12
 * @package top.ytazwc.spring
 * @description TODO
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
