package top.ytazwc.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author 花木凋零成兰
 * @title Account
 * @date 2024/6/12 8:51
 * @package top.ytazwc.spring.domain
 * @description TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private Double money;
}
