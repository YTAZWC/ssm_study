package top.ytazwc.spring.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author yt
 * 2024/6/13
 */
public class MyBatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        // 设置数据源
        sessionFactoryBean.setDataSource(dataSource);
        // 设置映射实体类所在包
        sessionFactoryBean.setTypeAliasesPackage("top.ytazwc.spring.domain");
        return sessionFactoryBean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        // 设置数据层操作接口所在包
        mapperScannerConfigurer.setBasePackage("top.ytazwc.spring.dao");
        return mapperScannerConfigurer;
    }

}
