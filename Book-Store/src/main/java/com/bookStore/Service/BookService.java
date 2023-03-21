package com.bookStore.Service;

import com.bookStore.Entity.Book;
import com.bookStore.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepo;
    public void save(Book book){
        bookRepo.save(book);
    }

    public List<Book> getAllBook(){
        return bookRepo.findAll();
    }

    public Book getBookById(int id){
        return bookRepo.findById(id).get();
    }

    public void deleteById(int id){
        bookRepo.deleteById(id);
    }
}
