package top.ytazwc.boot.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author yt
 * 2024/6/29
 */
@Setter
@Getter
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
