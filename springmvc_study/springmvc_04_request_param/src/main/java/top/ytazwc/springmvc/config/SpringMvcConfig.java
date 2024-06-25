package top.ytazwc.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author 花木凋零成兰
 * @title SpringMvcConfig
 * @date 2024/6/24 23:04
 * @package top.ytazwc.springmvc.config
 * @description Spring MVC 配置
 */
@Configuration
@ComponentScan({"top.ytazwc.springmvc.controller"})
@EnableWebMvc   // 开启JSON数据格式转换
public class SpringMvcConfig {
}
