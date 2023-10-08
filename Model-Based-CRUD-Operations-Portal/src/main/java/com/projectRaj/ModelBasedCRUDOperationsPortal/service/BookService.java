package com.projectRaj.ModelBasedCRUDOperationsPortal.service;

import com.projectRaj.ModelBasedCRUDOperationsPortal.models.Book;
import com.projectRaj.ModelBasedCRUDOperationsPortal.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    // Create a new book
    public String createBook(Book book) {
        bookRepository.save(book);
        return "Book with name :"+book.getTitle()+" added into the repository";
    }

    // Read a book by ID
    public Object getBookById(Long id) {
        Optional<Book> optionalBook= bookRepository.findById(id);
        if(optionalBook.isPresent()){
            return optionalBook;
        }
        return "Book with id :"+id+" not available";
    }

    // Update a book
    public String updateBook(Long id, Book book) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()){
            bookRepository.save(book);
            return "Book with id :"+id+" updated";
        }
        return "Book with id :"+id+" not available to update";
    }

    // Delete a book by ID
    public String deleteBookById(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()){
            bookRepository.deleteById(id);
            return "Book with id :"+id+" deleted";
        }
        return "Book with id :"+id+" not available";
    }

    // Get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

}
