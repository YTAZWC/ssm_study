package top.ytazwc.boot.dao;

import org.apache.ibatis.annotations.Mapper;
import top.ytazwc.boot.domain.Book;

/**
 * @author yt
 * 2024/6/29
 */
@Mapper
public interface BookMapper {
//    @Insert("select * from tbl_book where id = #{id}")
    Book getById(Integer id);
}
