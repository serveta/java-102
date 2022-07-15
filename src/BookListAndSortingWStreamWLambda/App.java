package BookListAndSortingWStreamWLambda;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        Date d1 = new Date();
        Date d2 = new Date();
        Date d3 = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");

        try {
            d1 = dateFormat.parse("11-11-2021");
            d2 = dateFormat.parse("14-01-2000");
            d3 = dateFormat.parse("30-06-1995");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Book b1 = new Book("Book-1", 311, "Author-1", d1);
        Book b2 = new Book("Book-2", 662, "Author-2", d2);
        Book b3 = new Book("Book-3", 112, "Author-3", d3);
        Book b4 = new Book("Book-4", 44, "Author-4", d2);
        Book b5 = new Book("Book-5", 55, "Author-5", d1);
        Book b6 = new Book("Book-6", 66, "Author-6", d2);
        Book b7 = new Book("Book-7", 77, "Author-7", d3);
        Book b8 = new Book("Book-8", 88, "Author-8", d1);
        Book b9 = new Book("Book-9", 99, "Author-9", d2);
        Book b10 = new Book("Book-10", 101, "Author-10", d3);

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);
        books.add(b7);
        books.add(b8);
        books.add(b9);
        books.add(b10);

        books.stream().map(val -> val.getBookName() +" - "+ val.getAuthorName()).forEach(System.out::println);

        System.out.println(" *Filter (pageNum > 100): ");
        books.stream()
                .filter(val -> val.getPageNum() > 100)
                .map(val -> val.getBookName() +" - "+ val.getAuthorName()).forEach(System.out::println);

    }
}
