package Lab_08_IteratorsAndComparators.P02_Library;

import java.util.Iterator;

public class Library implements Iterable<Book> {

    private Book[] books;

    private class LibraryIterator implements Iterator<Book> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < books.length;
        }

        @Override
        public Book next() {
            return books[index++];
        }

    }

    public Library(Book... books) {
        this.books = books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {


        Iterator<Book> bookIterator = new Iterator<Book>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < books.length;
            }

            @Override
            public Book next() {
                return books[index++];
            }
        };

        return new LibraryIterator();
    }
}
