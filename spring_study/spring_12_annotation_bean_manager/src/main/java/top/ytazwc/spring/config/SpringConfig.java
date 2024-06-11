package top.ytazwc.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 花木凋零成兰
 * @title SpringConfig
 * @date 2024/6/11 20:40
 * @package top.ytazwc.spring.config
 * @description Spring纯注解开发
 */
@Configuration  // 配置
@ComponentScan("top.ytazwc.spring.dao")     // bean扫描包
public class SpringConfig {
}
