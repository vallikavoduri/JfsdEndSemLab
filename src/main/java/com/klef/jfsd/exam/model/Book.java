package com.klef.jfsd.exam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_table")
public class Book
{
	@Id
	private int id;
	
	@Column(name = "book_title",length = 50,nullable = false)
	private String title;
	

	@Column(name = "author",length = 50,nullable = false)
	private String Author;

	@Column(name = "genre",length = 50,nullable = false)
	private String Genre;

	@Column(name = "price",nullable = false)
	private int price;

	@Column(name = "published_year",length = 50,nullable = false)
	private String published_year;
	
}