package top.ytazwc.spring.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import top.ytazwc.spring.dao.BookDao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author 花木凋零成兰
 * @title BookDaoImpl
 * @date 2024/6/11 20:17
 * @package top.ytazwc.spring.dao.impl
 * @description TODO
 */
@Repository
@Scope("singleton")     // 控制容器管理的bean是否单例，singleton单例、prototype非单例
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    @PostConstruct  // 创建后管理bean
    public void init() {
        System.out.println("init ...");
    }

    @PreDestroy     // 销毁前管理bean
    public void destroy() {
        System.out.println("destroy ...");
    }

}
