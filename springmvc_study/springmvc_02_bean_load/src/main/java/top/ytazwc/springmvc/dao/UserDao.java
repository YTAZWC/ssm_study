package top.ytazwc.springmvc.dao;

import org.apache.ibatis.annotations.Insert;
import top.ytazwc.springmvc.domain.User;

/**
 * @author yt
 * 2024/6/24
 */
public interface UserDao {
    @Insert("insert into tbl_user(name, age) values(#{name}, #{age})")
    void save(User user);
}
