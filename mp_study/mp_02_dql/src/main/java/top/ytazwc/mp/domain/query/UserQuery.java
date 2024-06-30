package top.ytazwc.mp.domain.query;

import lombok.Getter;
import lombok.Setter;
import top.ytazwc.mp.domain.User;

/**
 * @author 花木凋零成兰
 * @title UserQuery
 * @date 2024/6/30 15:34
 * @package top.ytazwc.mp.domain.query
 * @description User查询条件
 */
@Getter
@Setter
public class UserQuery extends User {
    private Integer ageUpper;
}
