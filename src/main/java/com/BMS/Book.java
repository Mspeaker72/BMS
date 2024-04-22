package com.BMS;

public class Book {
    private String isbn;
    private Author author;
    private String title;
    private String status;

    public Book(String isbn, Author author, String title) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.status = "Available";
    }

    public Author getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String stringValue(){
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", author=" + author +
                ", title='" + title + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
