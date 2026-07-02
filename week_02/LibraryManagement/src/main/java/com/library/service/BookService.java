package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	private BookRepository bookRepository;
	
	public BookService()
	{
		
	}
	
	public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
	
	public int availableBooks()
	{
		return bookRepository.getAvailableBooks();
	}
}