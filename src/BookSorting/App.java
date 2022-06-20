package BookSorting;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book("A Book1", 126, "B Name1", 1986));
        books.add(new Book("B Book2", 236, "D Name2", 1978));
        books.add(new Book("F Book3", 120, "Z Name3", 2000));
        books.add(new Book("D Book4", 301, "A Name4", 1999));
        books.add(new Book("S Book5", 199, "S Name5", 2009));

        System.out.println(" * The books sorted from A to Z; ");
        for (Book book : books) {
            System.out.println(book.getBookName());
        }

        System.out.println(" * The books are sorted by page number; ");

        TreeSet<Book> bookHashSet = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o2.getPageNumber(), o1.getPageNumber());
            }
        });

        bookHashSet.addAll(books);
        for (Book val : bookHashSet) {
            System.out.println(val.getBookName() + " - " + val.getPageNumber());
        }
    }
}
