package com.bookStore.Service;

import com.bookStore.Entity.MyBookList;
import com.bookStore.Repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MybookListService {

    @Autowired
    MyBookRepository myBookRepo;
    public void saveMyBooks(MyBookList bookList){
        myBookRepo.save(bookList);
    }

    public List<MyBookList> getAllMyBooks(){
        return myBookRepo.findAll();
    }

    public void deleteById(int id){
        myBookRepo.deleteById(id);
    }
}
