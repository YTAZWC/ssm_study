package top.ytazwc.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.ytazwc.boot.dao.BookMapper;
import top.ytazwc.boot.domain.Book;
import top.ytazwc.boot.service.BookService;

import java.util.List;

/**
 * @author yt
 * 2024/6/26
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public boolean save(Book book) {
        return bookMapper.save(book) > 0;
    }

    @Override
    public boolean update(Book book) {
        return bookMapper.update(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookMapper.delete(id) > 0;
    }

    @Override
    public Book getById(Integer id) {
        return bookMapper.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookMapper.getAll();
    }
}
