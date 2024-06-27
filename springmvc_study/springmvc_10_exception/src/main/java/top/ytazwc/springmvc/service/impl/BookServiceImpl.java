package top.ytazwc.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.ytazwc.springmvc.dao.BookDao;
import top.ytazwc.springmvc.domain.Book;
import top.ytazwc.springmvc.enums.BusinessCode;
import top.ytazwc.springmvc.enums.SystemCode;
import top.ytazwc.springmvc.exception.BusinessException;
import top.ytazwc.springmvc.exception.SystemException;
import top.ytazwc.springmvc.service.BookService;

import java.util.List;

/**
 * @author yt
 * 2024/6/26
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public Book getById(Integer id) {

        if (id == 1) {
            throw new BusinessException(BusinessCode.BUSINESS_ERR.getCode(), "请不要反复请求!");
        }

        // 将可能出现的异常进行包装 转换成自定义异常
        try {
            int i = 1/0;
        } catch (Exception e) {
            throw new SystemException(SystemCode.SYSTEM_ERR.getCode(), "服务器访问失败,请重试!", e);
        }

        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
