package top.ytazwc.spring.config;

import org.springframework.context.annotation.*;

/**
 * @author yt
 * 2024/6/13
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"top.ytazwc.spring"})
@PropertySource({"classpath:jdbc.properties"})
@Import({JDBCConfig.class, MyBatisConfig.class})
public class SpringConfig {
}
