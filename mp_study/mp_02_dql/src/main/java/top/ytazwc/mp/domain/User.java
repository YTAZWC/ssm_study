package top.ytazwc.mp.domain;

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
public class User {
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String tel;
}
