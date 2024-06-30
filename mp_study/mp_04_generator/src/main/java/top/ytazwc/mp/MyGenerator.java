package top.ytazwc.mp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;

/**
 * @author 花木凋零成兰
 * @title MyGenerator
 * @date 2024/6/30 20:47
 * @package top.ytazwc.mp
 * @description 生成器
 */
public class MyGenerator {
    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();

        // 数据库配置
        DataSourceConfig dataSource = new DataSourceConfig();
        dataSource.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mp_db?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        autoGenerator.setDataSource(dataSource);

        // 全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig
                // 设置代码输出目录
                .setOutputDir("E:/workspace/Java/workspace/ssm_study/mp_study/mp_04_generator/src/main/java")
                // 设置生成完毕后是否打开代码所在目录
                .setOpen(false)
                // 设置作者
                .setAuthor("花木凋零成兰")
                // 设置是否覆盖原始生成的文件
                .setFileOverride(true)
                // 设置数据层接口名，%s为占位符，指代模块名称
                .setMapperName("%sDao")
                // 设置id生成策略
                .setIdType(IdType.ASSIGN_ID);
        autoGenerator.setGlobalConfig(globalConfig);

        // 设置包相关配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig
                // 设置生成的包名
                .setParent("top.ytazwc.mp")
                // 设置实体类包名
                .setEntity("domain")
                // 设置数据层包名
                .setMapper("dao");
        autoGenerator.setPackageInfo(packageConfig);

        // 策略配置-数据库配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                // 设置当前参与生成的表名，参数为可变参数
//                .setInclude("tbl_user")
                // 设置数据库表的前缀名称，模块名称=数据库表名-前缀名
                .setTablePrefix("tbl_")
                // 设置是否启用Rest风格
                .setRestControllerStyle(true)
                // 设置乐观锁字段名
                .setVersionFieldName("version")
                // 设置逻辑删除字段名
                .setLogicDeleteFieldName("deleted")
                // 设置是否启用lombok
                .setEntityLombokModel(true);
        autoGenerator.setStrategy(strategyConfig);

        // 执行生成操作
        autoGenerator.execute();
    }
}
