package top.ytazwc.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author yt
 * 2024/6/14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Account implements Serializable {
    private final static long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private Double money;
}
