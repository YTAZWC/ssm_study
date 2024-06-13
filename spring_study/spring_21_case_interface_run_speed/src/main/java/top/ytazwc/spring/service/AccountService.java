package top.ytazwc.spring.service;

import top.ytazwc.spring.domain.Account;

import java.util.List;

/**
 * @author yt
 * 2024/6/13
 */
public interface AccountService {

    void save(Account account);

    void delete(Integer id);

    void update(Account account);

    List<Account> findAll();

    Account findById(Integer id);

}
