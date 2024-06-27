package top.ytazwc.springmvc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author yt
 * 2024/6/27
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum CommonCode {

    SYSTEM_UNKNOWN_ERR(5999);

    private Integer code;

}
