package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class BookConfiguration {
	@Bean(name = "book")
	public Book getBook() {
		Book book = new Book();
		book.setName("java");
		book.setName("java");
		book.setPrice(78967);
		return book;
		
	}
	public Author getAuthor() {
		Author author = new Author();
		author.setName("S.Rajput");
		return null;
		
	}

}
