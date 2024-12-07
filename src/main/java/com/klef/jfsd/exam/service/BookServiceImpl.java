package com.klef.jfsd.exam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.klef.jfsd.exam.model.Book;
import com.klef.jfsd.exam.repository.BookRepository;

public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository repository;

	@Override
	public String addBook(Book b) {
		 
		repository.save(b);
		
		return "Book Added Successfully";
	}

	@Override
	public String updateBook(Book b) {
		Optional<Book>  obj  = 	repository.findById(s.getId());
		String msg = null;
		if(obj.isPresent())
		{
			Book book = obj.get();
			book.setTitle(((Book) book).getTitle());
			book.setAuthor(b.getAuthor());
			book.setGenre(b.getGenre());
			book.setPrice(b.getPrice());
			book.setPublished_year(b.getPublished_year());
			
			repository.save(book);
			msg = "Student updated Successfully";
			
			
			
		}
		else {
			msg = "Student ID not Found";
		}
		
		return msg;
	}

	

}
