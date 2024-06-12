package top.ytazwc.spring;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import top.ytazwc.spring.dao.AccountDao;
import top.ytazwc.spring.domain.Account;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 花木凋零成兰
 * @title App
 * @date 2024/6/12 8:46
 * @package top.ytazwc.spring
 * @description TODO
 */
public class App {
    public static void main(String[] args) throws IOException {
        // 1. 创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 2. 加载SqlMapConfig.xml配置文件
        InputStream inputStream =  Resources.getResourceAsStream("SqlMapConfig.xml");
        // 3. 创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

        // 4. 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 5. SqlSession对象执行查询 获取结果
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        Account account = accountDao.findById(2);
        System.out.println(account);
        // 6. 释放资源
        sqlSession.close();
    }
}
