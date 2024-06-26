package top.ytazwc.springmvc.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author 花木凋零成兰
 * @title Code
 * @date 2024/6/26 22:27
 * @package top.ytazwc.springmvc.controller
 * @description 执行结果状态码
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum Code {

    SAVE_OK(20011),
    DELETE_OK(20021),
    UPDATE_OK(20031),
    GET_OK(20041),
    SAVE_ERR(20010),
    DELETE_ERR(20020),
    UPDATE_ERR(20030),
    GET_ERR(20040);

    private Integer code;

}
