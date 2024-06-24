package top.ytazwc.springmvc.service.impl;

import org.springframework.stereotype.Service;
import top.ytazwc.springmvc.domain.User;
import top.ytazwc.springmvc.service.UserService;

/**
 * @author yt
 * 2024/6/24
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
        System.out.println("user service ...");
    }
}
