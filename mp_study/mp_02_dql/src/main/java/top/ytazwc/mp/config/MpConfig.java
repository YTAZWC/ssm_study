package top.ytazwc.mp.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 花木凋零成兰
 * @title MpConfig
 * @date 2024/6/30 14:57
 * @package top.ytazwc.mp.config
 * @description Mybatis-plus 配置类
 */
@Configuration
public class MpConfig {

    /**
     * 开启Mybatis-Plus分页功能，配置分页拦截器
     * @return
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }

}
