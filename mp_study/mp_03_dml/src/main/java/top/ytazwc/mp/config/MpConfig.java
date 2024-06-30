package top.ytazwc.mp.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 花木凋零成兰
 * @title MpConfig
 * @date 2024/6/30 20:11
 * @package top.ytazwc.mp.config
 * @description Mybatis-Plus 配置
 */
@Configuration
public class MpConfig {
    // 配置拦截器
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        // 1. 定义Mybatis-Plus拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 2. 添加分页拦截器
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        // 3. 添加乐观锁拦截器
        interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
        return interceptor;
    }
}
