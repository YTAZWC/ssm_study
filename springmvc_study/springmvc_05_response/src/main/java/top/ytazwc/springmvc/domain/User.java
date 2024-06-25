package top.ytazwc.springmvc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author 花木凋零成兰
 * @title User
 * @date 2024/6/25 22:11
 * @package top.ytazwc.springmvc.domain
 * @description 用户
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {
    private String name;
    private Integer age;
}
