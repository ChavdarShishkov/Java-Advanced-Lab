package Lab_08_IteratorsAndComparators.P02_Library;

import Lab_08_IteratorsAndComparators.P01_Book.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        Library library = new Library(new Lab_08_IteratorsAndComparators.P02_Library.Book("The", 12));

        Iterator<Lab_08_IteratorsAndComparators.P02_Library.Book> iterator = library.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

