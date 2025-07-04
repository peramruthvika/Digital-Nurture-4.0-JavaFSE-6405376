package com.library.service;

import com.library.model.LibraryInfo;
import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private LibraryInfo libraryInfo;


    public BookService(LibraryInfo libraryInfo) {
        this.libraryInfo = libraryInfo;
    }

    
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook(int id) {
        System.out.println("Library: " + libraryInfo.getLibraryName());
        System.out.println("Book: " + bookRepository.findBookById(id));
    }
}
