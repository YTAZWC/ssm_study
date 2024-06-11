package top.ytazwc.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 花木凋零成兰
 * @title SpringConfig
 * @date 2024/6/11 22:20
 * @package top.ytazwc.spring.config
 * @description TODO
 */
@Configuration
@ComponentScan("top.ytazwc.spring")
@PropertySource({"classpath:jdbc.properties"})    // 不支持使用通配符
public class SpringConfig {
}
