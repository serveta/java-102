package BookListAndSortingWStreamWLambda;

import java.util.Date;

public class Book {
    private String bookName;
    private int pageNum;
    private String authorName;
    private Date publishDate;

    public Book(String bookName, int pageNum, String authorName, Date publishDate) {
        this.bookName = bookName;
        this.pageNum = pageNum;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
