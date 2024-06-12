package top.ytazwc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.ytazwc.spring.config.SpringConfig;
import top.ytazwc.spring.domain.Account;
import top.ytazwc.spring.service.AccountService;

/**
 * @author 花木凋零成兰
 * @title App2
 * @date 2024/6/12 14:12
 * @package top.ytazwc.spring
 * @description 使用Spring整合Mybatis后
 */
public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        Account account = accountService.findById(2);
        System.out.println(account);
    }
}
