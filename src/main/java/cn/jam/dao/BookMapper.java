package cn.jam.dao;

import cn.jam.pojo.Books;
import org.apache.ibatis.annotations.Param;

/**
 * @author jam
 * @date 2021/4/13 22:54
 */
public interface BookMapper {
    /**
     * 通过id查询Book对象
     * @param id bookId
     * @return Book对象
     */
    Books queryBookById(@Param("bookId") long id);
}
