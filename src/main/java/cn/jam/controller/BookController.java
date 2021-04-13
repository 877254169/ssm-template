package cn.jam.controller;

import cn.jam.pojo.Books;
import cn.jam.service.BookService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jam
 * @date 2021/4/13 23:23
 */
@Controller
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("query/{bookId}")
    public String queryById(@PathVariable("bookId") long id, Model model) {
        Books book = bookService.queryBookById(id);
        model.addAttribute("book", JSON.toJSONString(book));
        return "book";
    }

}
