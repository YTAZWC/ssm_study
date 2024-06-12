package top.ytazwc.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 花木凋零成兰
 * @title SpringConfig
 * @date 2024/6/12 22:47
 * @package top.ytazwc.top.config
 * @description TODO
 */
@Configuration
@ComponentScan({"top.ytazwc.spring"})
@EnableAspectJAutoProxy
public class SpringConfig {
}
