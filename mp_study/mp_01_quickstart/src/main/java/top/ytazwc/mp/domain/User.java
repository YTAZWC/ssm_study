package top.ytazwc.mp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author yt
 * 2024/6/29
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String tel;
}
