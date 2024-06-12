package top.ytazwc.spring.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author 花木凋零成兰
 * @title MybatisConfig
 * @date 2024/6/12 14:04
 * @package top.ytazwc.spring.config
 * @description TODO
 */
public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        // 设置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        // 设置实体类型
        sqlSessionFactoryBean.setTypeAliasesPackage("top.ytazwc.spring.domain");
        return sqlSessionFactoryBean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        // 设置映射所在包
        msc.setBasePackage("top.ytazwc.spring.dao");
        return msc;
    }
}
