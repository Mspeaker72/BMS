package com.BMS;

import java.util.HashMap;
import java.util.Objects;

public class BookRepository {
    private HashMap <String, Book> availableBooks;
    private HashMap <String, Book> loanedBooks;

    public BookRepository() {
        this.availableBooks = new HashMap<>();
        this.loanedBooks = new HashMap<>();
    }

    public void addBook(Book book) {
        availableBooks.put(book.getIsbn(),book);
    }

    private void updateBookAvailavility(Book book,String status){
        if(status.equals("Returned")){
            book.setStatus("Available");
            availableBooks.put(book.getIsbn(),book);
            return;
        }
        book.setStatus("Loaned Out");
        availableBooks.remove(book.getIsbn());
        loanedBooks.put(book.getIsbn(),book);

    }

    public HashMap<String, Book> getAvailableBooks() {
        return availableBooks;
    }
    public HashMap<String, Book> getLoanedBooks() {
        return loanedBooks;
    }
}
