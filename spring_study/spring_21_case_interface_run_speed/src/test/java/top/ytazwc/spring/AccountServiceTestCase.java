package top.ytazwc.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.ytazwc.spring.config.SpringConfig;
import top.ytazwc.spring.domain.Account;
import top.ytazwc.spring.service.AccountService;

import java.util.List;

/**
 * @author yt
 * 2024/6/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTestCase {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById() {
        Account ac = accountService.findById(2);
        System.out.println(ac);
    }

    @Test
    public void testFindAll() {
        List<Account> all = accountService.findAll();
        System.out.println(all);
    }

}
