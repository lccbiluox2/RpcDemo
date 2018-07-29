package Entity;

import java.io.Serializable;

/**
 * Created by lcc on 2018/7/29.
 */
public class Book implements Serializable {

    private static final long serialVersionUID = 0L;


    // 书的名称
    private String bookName;
    // 这本书属于谁
    private String belongWho;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBelongWho() {
        return belongWho;
    }

    public void setBelongWho(String belongWho) {
        this.belongWho = belongWho;
    }
}
