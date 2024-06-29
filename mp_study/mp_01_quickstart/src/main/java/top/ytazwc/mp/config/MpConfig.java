package top.ytazwc.mp.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yt
 * 2024/6/29
 */
@Configuration
public class MpConfig {

    // mybatis-plus 分页拦截器 - 开启分页功能
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        // 1. 定义mp拦截器
        MybatisPlusInterceptor mpInterceptor = new MybatisPlusInterceptor();
        mpInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        // 2. 添加具体的拦截器
        return mpInterceptor;
    }

}
