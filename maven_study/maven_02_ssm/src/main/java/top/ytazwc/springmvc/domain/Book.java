package top.ytazwc.springmvc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author yt
 * 2024/6/26
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
