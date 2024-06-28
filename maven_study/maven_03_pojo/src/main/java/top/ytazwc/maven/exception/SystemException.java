package top.ytazwc.maven.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author yt
 * 2024/6/27
 */
@Getter
@Setter
public class SystemException extends RuntimeException {
    /**
     * 异常编号
     */
    private Integer code;

    public SystemException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SystemException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}