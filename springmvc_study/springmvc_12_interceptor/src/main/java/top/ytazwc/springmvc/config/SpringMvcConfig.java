package top.ytazwc.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author yt
 * 2024/6/27
 */
@Configuration
@EnableWebMvc
@ComponentScan({"top.ytazwc.springmvc.controller"})
public class SpringMvcConfig {
}
