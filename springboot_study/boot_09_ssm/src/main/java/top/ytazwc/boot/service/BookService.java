package top.ytazwc.boot.service;

import org.springframework.transaction.annotation.Transactional;
import top.ytazwc.boot.domain.Book;

import java.util.List;

/**
 * @author yt
 * 2024/6/26
 */
@Transactional
public interface BookService {

    /**
     * 保存图书
     * @param book 图书信息
     * @return 保存结果
     */
    boolean save(Book book);

    /**
     * 修改
     * @param book 修改
     * @return 修改结果
     */
    boolean update(Book book);

    /**
     * 删除
     * @param id
     */
    boolean delete(Integer id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Book getById(Integer id);

    /**
     * 查询所有
     * @return
     */
    List<Book> getAll();

}
