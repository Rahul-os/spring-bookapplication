package book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book.entity.Book;
import book.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService { 
	@Autowired
	BookRepository repo;
	
	
	@Override
	

}
