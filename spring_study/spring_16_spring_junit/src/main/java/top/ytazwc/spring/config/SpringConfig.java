package top.ytazwc.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 花木凋零成兰
 * @title SpringConfig
 * @date 2024/6/12 13:58
 * @package top.ytazwc.spring.config
 * @description TODO
 */
@Configuration
@ComponentScan("top.ytazwc.spring")
@PropertySource({"classpath:jdbc.properties"})
@Import({JDBCConfig.class, MybatisConfig.class})
public class SpringConfig {
}
