package top.ytazwc.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.ytazwc.spring.dao.LogDao;
import top.ytazwc.spring.service.LogService;

/**
 * @author yt
 * 2024/6/14
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;

    @Override
    public void log(String out, String in, Double money) {
        logDao.log("转账操作由" + out + "到" + in + ",金额：" + money);
    }
}
