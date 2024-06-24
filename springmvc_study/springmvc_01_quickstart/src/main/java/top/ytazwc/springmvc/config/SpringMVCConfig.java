package top.ytazwc.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yt
 * 2024/6/24
 * SpringMVC的配置文件 加载对应Controller的bean
 */
@Configuration
@ComponentScan({"top.ytazwc.springmvc.controller"})
public class SpringMVCConfig {
}
