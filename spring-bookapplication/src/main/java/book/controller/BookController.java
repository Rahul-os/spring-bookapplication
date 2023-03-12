package book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import book.entity.Book;
import book.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	BookService service;
	
	@PostMapping
	public ResponseEntity<String> addNewBook(@RequestBody Book book){
		int id = service.addBook(book);
		return new ResponseEntity<String>("book inserted"+id,HttpStatus.OK);
	}

}
