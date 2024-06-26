package top.ytazwc.spring.dao.impl;

import org.springframework.stereotype.Repository;
import top.ytazwc.spring.dao.BookDao;

/**
 * @author 花木凋零成兰
 * @title BookDaoImpl
 * @date 2024/6/12 15:30
 * @package top.ytazwc.spring.dao.impl
 * @description TODO
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        // 记录程序当前执行(开始时间)
        Long startTime = System.currentTimeMillis();
        // 业务执行万次
        for (int i = 0; i < 10000; i++) {
            System.out.println("book dao save ...");
        }
        // 记录程序当前执行时间(结束时间)
        Long endTime = System.currentTimeMillis();
        // 计算总时间
        Long totalTime = endTime - startTime;
        // 输出信息
        System.out.println("执行万次消耗时间：" + totalTime + "ms");
    }

    @Override
    public void delete() {
        System.out.println("book dao delete ...");
    }

    @Override
    public void update() {
        System.out.println("book dao update ...");
    }

    @Override
    public void select() {
        System.out.println("book dao select ...");
    }
}
