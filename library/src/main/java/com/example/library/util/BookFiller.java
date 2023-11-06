package com.example.library.util;

import org.springframework.stereotype.Component;

import com.example.library.model.Book;
import com.example.library.service.BookService;

import jakarta.annotation.PostConstruct;

@Component
public class BookFiller {
    private final BookService bookService;
    
    public BookFiller(BookService bookService) {
        this.bookService = bookService;
    }

    @PostConstruct 
    public void init()
    {
        Book book1 = new Book("La Sirenita", "Primer libro", "Mauricio F.");
        bookService.addBook(book1);
        int millis;
        try {Thread.sleep(millis= 1000);} catch (InterruptedException e) {}

        Book book2 = new Book("El señor de los anillos", "Segundo libro", "Jose A.");
        bookService.addBook(book2);
                try {Thread.sleep(millis= 1000);} catch (InterruptedException e) {}

        Book book3 = new Book("Sherk", "Tercer libro", "Manuel M.");
        bookService.addBook(book3);
    
    }
}