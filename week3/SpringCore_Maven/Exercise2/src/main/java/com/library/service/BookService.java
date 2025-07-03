package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printBook(int id) {
        System.out.println("📘 Book Found: " + bookRepository.getBookById(id));
    }
}
