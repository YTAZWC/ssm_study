package top.ytazwc.spring.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author yt
 * 2024/6/14
 */
public interface AccountService {
    @Transactional
    void transfer(String out, String in, Double money);
}
