package top.ytazwc.spring.factory;

import org.springframework.beans.factory.FactoryBean;
import top.ytazwc.spring.dao.UserDao;
import top.ytazwc.spring.dao.impl.UserDaoImpl;

/**
 * @author 花木凋零成兰
 * @title UserDaoFactoryBean
 * @date 2024/6/10 21:34
 * @package top.ytazwc.spring.factory
 * @description TODO
 */
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    // 代替原始实例工厂中，创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    // 工厂创建的对象的类型
    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
    // 确定工厂创建的对象是否单例
    @Override
    public boolean isSingleton() {
        return false;
    }
}
