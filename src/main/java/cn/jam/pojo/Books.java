package cn.jam.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jam
 * @date 2021/4/10 14:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    /**
     * id
     */
    private long bookId;
    /**
     * 书名
     */
    private String bookName;
    /**
     * 数量
     */
    private int bookCounts;
    /**
     * 描述
     */
    private String detail;
}
