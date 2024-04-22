package com.BMS;

import java.util.Optional;

public class Book {
    private String isbn;
    private Author author;
    private String title;
    private String status;
    private Optional<String> imageUrl;

    public Book(String isbn, Author author, String title ,Optional<String> imageUrl ) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.status = "Available";
        this.imageUrl = imageUrl;
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

    public String stringValue() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", author=" + author +
                ", title='" + title + '\'' +
                ", status='" + status + '\'' +
                ", imageUrl='" + imageUrl.orElse("N/A") + '\'' + // Default value if not present
                '}';
    }
}
