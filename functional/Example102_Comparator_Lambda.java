package functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

// Lambda로 Comparator 구현

class Book {
    String title;
    int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " (" + year + ")";
    }
}

public class Example102_Comparator_Lambda {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java", 2020));
        books.add(new Book("Python", 2018));
        books.add(new Book("C++", 2022));

        System.out.println("=== 원본 ===");
        System.out.println(books);

        System.out.println("\n=== 제목순 정렬 ===");
        books.sort(Comparator.comparing(b -> b.title));
        System.out.println(books);

        System.out.println("\n=== 년도순 정렬 ===");
        books.sort(Comparator.comparingInt(b -> b.year));
        System.out.println(books);

        System.out.println("\n=== 년도 역순 ===");
        books.sort(Comparator.comparingInt(Book::year).reversed());
        System.out.println(books);
    }
}
