package cn.jam.service;

import cn.jam.dao.BookMapper;
import cn.jam.pojo.Books;
import org.springframework.stereotype.Service;

/**
 * @author jam
 * @date 2021/4/13 23:12
 */
@Service
public class BookServiceImpl implements BookService {

    private final BookMapper bookMapper;

    /** Spring4.x之后，使用构造器就可以不需要@Autowired注解 */
    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public Books queryBookById(long id) {
        return bookMapper.queryBookById(id);
    }
}
