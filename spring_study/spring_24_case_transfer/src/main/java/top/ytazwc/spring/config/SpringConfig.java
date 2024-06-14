package top.ytazwc.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author yt
 * 2024/6/14
 */
@Configuration
@ComponentScan("top.ytazwc.spring")
@PropertySource({"classpath:jdbc.properties"})
@Import({JDBCConfig.class, MybatisConfig.class})
@EnableTransactionManagement    // 开启注解事务管理
public class SpringConfig {
}
