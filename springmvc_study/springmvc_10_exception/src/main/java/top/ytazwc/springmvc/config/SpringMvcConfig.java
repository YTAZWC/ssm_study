package top.ytazwc.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author yt
 * 2024/6/26
 */
@Configuration
@ComponentScan({"top.ytazwc.springmvc.controller", "top.ytazwc.springmvc.advice"})
@EnableWebMvc
public class SpringMvcConfig {
}
