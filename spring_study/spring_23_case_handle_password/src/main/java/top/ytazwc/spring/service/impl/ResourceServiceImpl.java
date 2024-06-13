package top.ytazwc.spring.service.impl;

import org.springframework.stereotype.Repository;
import top.ytazwc.spring.service.ResourceService;

/**
 * @author 花木凋零成兰
 * @title ResourceServiceImpl
 * @date 2024/6/13 23:04
 * @package top.ytazwc.spring.service.impl
 * @description TODO
 */
@Repository
public class ResourceServiceImpl implements ResourceService {
    @Override
    public boolean openURL(String url, String password) {
        // 打印参数长度
        System.out.println(password.length());
        // 模拟校验
        return "root".equals(password);
    }
}
