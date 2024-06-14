package top.ytazwc.spring.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.ytazwc.spring.config.SpringConfig;

import java.io.IOException;

/**
 * @author yt
 * 2024/6/14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void TestTransfer() throws IOException {
        accountService.transfer("Tom", "Jerry", 50D);
    }

}
