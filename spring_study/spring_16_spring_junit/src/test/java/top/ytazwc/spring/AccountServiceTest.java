package top.ytazwc.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.ytazwc.spring.config.SpringConfig;
import top.ytazwc.spring.service.AccountService;

/**
 * @author 花木凋零成兰
 * @title AccountServiceTest
 * @date 2024/6/12 14:55
 * @package top.ytazwc.spring
 * @description TODO
 */
@RunWith(SpringJUnit4ClassRunner.class) // 设置类运行器
@ContextConfiguration(classes = SpringConfig.class)     // 运行环境
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById() {
        System.out.println(accountService.findById(2));
    }

    @Test
    public void testFindAll() {
        System.out.println(accountService.findAll());
    }

}
