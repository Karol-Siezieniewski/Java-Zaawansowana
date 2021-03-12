package pl.sda.zdjavapol73.homework.exceptions.task2;

public class Book {

    int isbn;
    String title;
    String author;
    int yearOfPublished;

    public Book(int isbn, String title, String author, int yearOfPublished) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublished = yearOfPublished;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int yearOfPublished() {
        return yearOfPublished;
    }

    public void setYearOfPublishment(int yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublished=" + yearOfPublished +
                '}';
    }
}
