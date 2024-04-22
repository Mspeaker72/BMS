package com.BMS;
;

public class LibraryManagementSystem {

    private BookRepository  bookRepository ;
    public LibraryManagementSystem() {}


    public void display(String state){

        if(state.equals("Available")){
            System.out.println("Available Books:");
            for(Book book : bookRepository.getAvailableBooks().values()){
                System.out.println(book.stringValue());
            }

        }else if(state.equals("Loaned Out")){
            System.out.println("Loaned Out");
            for(Book book : bookRepository.getLoanedBooks().values()){
                System.out.println(book.stringValue());
            }
        }
        System.out.println("The collection in question doesn't exist ," +
                "please type help for assistance");
    }


}
