package top.ytazwc.boot.dao;

import org.apache.ibatis.annotations.*;
import top.ytazwc.boot.domain.Book;

import java.util.List;

/**
 * @author yt
 * 2024/6/26
 */
@Mapper     // TODO Mapper注解
public interface BookMapper {
    @Insert("insert into tbl_book (type, name, description) values(#{type}, #{name}, #{description})")
    int save(Book book);

    @Update("update tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    int update(Book book);

    @Delete(("delete from tbl_book where id = #{id}"))
    int delete(Integer id);

    @Select("select * from tbl_book where id = #{id}")
    Book getById(Integer id);

    @Select("select * from tbl_book")
    List<Book> getAll();
}
