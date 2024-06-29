package top.ytazwc.mp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.ytazwc.mp.domain.User;

/**
 * @author yt
 * 2024/6/29
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
