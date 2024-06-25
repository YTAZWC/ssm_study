package top.ytazwc.springmvc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author 花木凋零成兰
 * @title Book
 * @date 2024/6/25 23:14
 * @package top.ytazwc.springmvc.domain
 * @description TODO
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Book {
    private String name;
    private double price;
}
