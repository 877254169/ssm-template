package cn.jam.service;

import cn.jam.dao.BookMapper;
import cn.jam.pojo.Books;
import org.springframework.stereotype.Service;

/**
 * @author jam
 * @date 2021/4/13 23:10
 */
public interface BookService {
    /**
     * 通过id查找Book对象
     * @param id id
     * @return Book对象
     */
    Books queryBookById(long id);
}
