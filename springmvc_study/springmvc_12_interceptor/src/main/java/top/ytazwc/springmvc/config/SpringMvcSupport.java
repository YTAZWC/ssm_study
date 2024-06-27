package top.ytazwc.springmvc.config;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import top.ytazwc.springmvc.controller.interceptor.ProjectInterceptor;

/**
 * @author yt
 * 2024/6/27
 */
// @Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {

    private ProjectInterceptor projectInterceptor;

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books/**");
    }
}
