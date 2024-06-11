package top.ytazwc.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 花木凋零成兰
 * @title SpringConfig
 * @date 2024/6/11 23:13
 * @package top.ytazwc.spring.config
 * @description TODO
 */
@Configuration
@ComponentScan("top.ytazwc.spring.dao")
@Import({JdbcConfig.class})
public class SpringConfig {
}
