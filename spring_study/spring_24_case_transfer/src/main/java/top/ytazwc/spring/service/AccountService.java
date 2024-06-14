package top.ytazwc.spring.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author yt
 * 2024/6/14
 */
public interface AccountService {

    /**
     * 转账
     * @param out 转出方
     * @param in 转入方
     * @param money 金额
     */
    @Transactional
    void transfer(String out, String in, Double money);

}
