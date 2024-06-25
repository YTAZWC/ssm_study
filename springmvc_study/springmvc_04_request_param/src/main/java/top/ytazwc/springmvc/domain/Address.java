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
public class Address {
    private String province;
    private String city;
}
