package top.ytazwc.spring.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author yt
 * 2024/6/14
 */
@Repository
public interface LogDao {

    @Insert("insert into tbl_log (info, createDate) values (#{info}, now())")
    void log(@Param("info") String info);

}
