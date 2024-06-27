package top.ytazwc.maven.enums;

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
public enum SystemCode {

    SYSTEM_ERR(50001),
    SYSTEM_TIMEOUT_ERR(50002);

    /**
     * 系统异常编码
     */
    private Integer code;

}
