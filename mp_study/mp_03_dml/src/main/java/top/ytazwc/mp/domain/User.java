package top.ytazwc.mp.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.Version;
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

    // 逻辑删除字段
//    @TableLogic(value = "0", delval = "1") // 标记为逻辑删除字段
    @TableField(select = false)
    private Integer deleted;

    // 乐观锁
    @Version
    private Integer version;
}
