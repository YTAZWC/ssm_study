package top.ytazwc.maven.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author yt
 * 2024/6/26
 */
@Configuration
@ComponentScan({"top.ytazwc.maven.service"})
@PropertySource({"classpath:jdbc.properties"})
@Import({JDBCConfig.class, MybatisConfig.class})
@EnableTransactionManagement    // 开启注解
public class SpringConfig {
}
