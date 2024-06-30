package top.ytazwc.mp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.ytazwc.mp.domain.User;

/**
 * @author 花木凋零成兰
 * @title UserDao
 * @date 2024/6/30 15:01
 * @package top.ytazwc.mp.dao
 * @description 用户数据层操作接口
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
