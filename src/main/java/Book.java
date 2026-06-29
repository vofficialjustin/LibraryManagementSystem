package main.java;

public class Book implements Comparable<Book> {
    private String author;
    private String title;
    private String ISBN;
    private boolean checkedOut;

    public Book() {
        title = "N/A";
        author = "N/A";
        ISBN = "N/A";
        checkedOut = false;
    }

    public Book(String author, String title, String ISBN, boolean checkedOut) {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.checkedOut = false;
    }

    public Book(Book other) {
        this.author = other.author;
        this.title = other.title;
        this.ISBN = other.ISBN;
        this.checkedOut = other.checkedOut;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String isbn) {
        this.ISBN = isbn;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
}
