package top.ytazwc.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import top.ytazwc.spring.dao.BookDao;

import javax.sql.DataSource;

/**
 * @author 花木凋零成兰
 * @title JdbcConfig
 * @date 2024/6/11 23:20
 * @package top.ytazwc.spring.config
 * @description 数据库连接配置类
 */
//@Configuration
public class JdbcConfig {
    @Value("com.mysql.cj.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306/spring_db")
    private String url;
    @Value("root")
    private String username;
    @Value("123456")
    private String password;

    // 1. 定义一个方法 获得要管理的对象
    @Bean   // 2. 添加@Bean 表示当前方法的返回值是一个bean
    public DataSource dataSource(BookDao bookDao) {
        System.out.println(bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
}
