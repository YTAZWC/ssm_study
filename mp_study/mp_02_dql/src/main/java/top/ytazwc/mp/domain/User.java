package top.ytazwc.mp.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 花木凋零成兰
 * @title User
 * @date 2024/6/30 15:00
 * @package top.ytazwc.mp.domain
 * @description 用户类
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("tbl_user")  // 设置类与数据表的对应关系
public class User {
    private Long id;
    private String name;
    @TableField(value = "pwd", select = false)
    private String password;
    private Integer age;
    private String tel;

    // value-对应数据库表字段
    // exist-数据库表中是否存在该字段
    // select-是否参与查询，与select()映射配置不冲突
    @TableField(exist = false)
    private Integer online;
}
