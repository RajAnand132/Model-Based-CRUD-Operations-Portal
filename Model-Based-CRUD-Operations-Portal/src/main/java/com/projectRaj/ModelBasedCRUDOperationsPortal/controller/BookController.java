package com.projectRaj.ModelBasedCRUDOperationsPortal.controller;

import com.projectRaj.ModelBasedCRUDOperationsPortal.models.Book;
import com.projectRaj.ModelBasedCRUDOperationsPortal.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("api/book")
    public String createbook(@RequestBody Book book) {
        // Calls the service to create a new book
        return bookService.createBook(book);
    }

    // Read a book by ID
    @GetMapping("api/book/{id}")
    public Object getBookById(@PathVariable Long id) {
        // Calls the service to retrieve a book by ID
        return bookService.getBookById(id);
    }

    // Update a book
    @PutMapping("api/book/id/{id}/bookDetails")
    public String updateBook(@PathVariable Long id, @RequestBody Book book) {
        // Calls the service to update a book
        return bookService.updateBook(id, book);
    }

    // Delete a book by ID
    @DeleteMapping("api/book/id/{id}")
    public String deleteBookById(@PathVariable Long id) {
        // Calls the service to delete a book by ID
        return bookService.deleteBookById(id);
    }

    // Get all books
    @GetMapping("api/allBooks")
    public List<Book> getAllbooks() {
        // Calls the service to retrieve all books
        return bookService.getAllBooks();
    }
}
