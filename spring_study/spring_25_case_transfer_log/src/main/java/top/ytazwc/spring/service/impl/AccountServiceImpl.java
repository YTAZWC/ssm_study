package top.ytazwc.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.ytazwc.spring.dao.AccountDao;
import top.ytazwc.spring.service.AccountService;
import top.ytazwc.spring.service.LogService;

/**
 * @author yt
 * 2024/6/14
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Autowired
    private LogService logService;

    @Override
    public void transfer(String out, String in, Double money){
        try {
            accountDao.outMoney(out, money);
            int i = 1/0;
            accountDao.inMoney(in, money);
        } finally {
            logService.log(out, in, money);
        }
    }
}
