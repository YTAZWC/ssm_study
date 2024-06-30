package top.ytazwc.mp.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 花木凋零成兰
 * @title User
 * @date 2024/6/30 17:40
 * @package top.ytazwc.mp.domain
 * @description 用户类
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
//@TableName("tbl_user")
public class User {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    @TableField(value = "pwd", select = false)
    private String password;
    private Integer age;
    private String tel;
}
