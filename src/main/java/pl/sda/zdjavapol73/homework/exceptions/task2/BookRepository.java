package pl.sda.zdjavapol73.homework.exceptions.task2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    public List<Book> booksList = new ArrayList<>();

    public void addBook(Book book) {
        this.booksList.add(book);
    }

    public void removeBook(int isbn) throws NoBookFoundException {
        for (Book book : booksList) {
            if (book.getIsbn() == isbn) {
                booksList.remove(book);
                return;
            }
            throw new NoBookFoundException("Cant delete book with ISBN: " + isbn);
        }
    }

    public Book findBookByName(String title) throws NoBookFoundException {
        for (Book book : booksList) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        throw new NoBookFoundException("Cant find book with title: " + title);
    }
}


