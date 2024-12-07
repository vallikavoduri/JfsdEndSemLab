package com.klef.jfsd.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.service.BookService;

@RestController
@RequestMapping("student")
public class BookController
{
	
	@Autowired
	private BookService service;
	
	
	@GetMapping("/")
	public String home()
	{
		return "Spring Boot Book Project";
	}

}
