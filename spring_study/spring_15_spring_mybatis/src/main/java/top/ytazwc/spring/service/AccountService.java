package top.ytazwc.spring.service;

import top.ytazwc.spring.domain.Account;

import java.util.List;

/**
 * @author 花木凋零成兰
 * @title AccountService
 * @date 2024/6/12 9:05
 * @package top.ytazwc.spring.service
 * @description TODO
 */
public interface AccountService {
    void save(Account account);

    void delete(Integer id);

    void update(Account account);

    List<Account> findAll();

    Account findById(Integer id);
}
