package top.ytazwc.springmvc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author yt
 * 2024/6/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String name;
    private int age;

    private Address address;
}
