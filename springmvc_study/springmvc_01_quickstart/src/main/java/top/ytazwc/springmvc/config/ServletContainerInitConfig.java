package top.ytazwc.springmvc.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @author yt
 * 2024/6/24
 * 定义servlet容器启动的配置类，加载Spring的配置
 */
public class ServletContainerInitConfig extends AbstractDispatcherServletInitializer {
    // 加载SpringMVC容器配置
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        // 获取容器
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        // 注册加载的配置
        ctx.register(SpringMVCConfig.class);
        return ctx;
    }

    // 设置哪些请求归属SpringMVC处理
    @Override
    protected String[] getServletMappings() {
        // 设置所有请求
        return new String[]{"/"};
    }

    // 加载Spring容器配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
