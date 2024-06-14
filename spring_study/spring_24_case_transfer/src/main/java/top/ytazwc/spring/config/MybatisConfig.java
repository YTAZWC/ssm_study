package top.ytazwc.spring.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author yt
 * 2024/6/14
 */
public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        // 配置数据源
        bean.setDataSource(dataSource);
        // 配置映射实体所在包
        bean.setTypeAliasesPackage("top.ytazwc.spring.domain");
        return bean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        // 配置数据层操作接口所在包
        configurer.setBasePackage("top.ytazwc.spring.dao");
        return configurer;
    }

}
