package top.ytazwc.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.ytazwc.spring.dao.AccountDao;
import top.ytazwc.spring.domain.Account;
import top.ytazwc.spring.service.AccountService;

import java.util.List;

/**
 * @author 花木凋零成兰
 * @title AccountServiceImpl
 * @date 2024/6/12 9:06
 * @package top.ytazwc.spring.service.impl
 * @description TODO
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }

    @Override
    public void delete(Integer id) {
        accountDao.delete(id);
    }

    @Override
    public void update(Account account) {
        accountDao.update(account);
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }
}
