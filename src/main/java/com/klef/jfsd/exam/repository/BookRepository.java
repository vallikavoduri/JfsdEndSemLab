package com.klef.jfsd.exam.repository;

import java.awt.print.Book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends CrudRepository<Book, Integer>
{
	
}
