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
public enum BusinessCode {

    BUSINESS_ERR(60001);

    /**
     * 系统异常编码
     */
    private Integer code;

}
