package com.danial.books.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.danial.books.models.Book;
import com.danial.books.services.BookService;

@Controller
public class BookController {
	private final BookService bookService;
	public BookController (BookService bookService){
	     this.bookService = bookService;
	}
	
	@RequestMapping("/")
	public String home(Model model) {
		
		List<Book> books = bookService.allBooks();
        
        model.addAttribute("books", books);
		
		return "allBooks.jsp";
	}
	
	@RequestMapping("/books/{id}")
	public String singleBook(Model model, @PathVariable("id") Long id) {
		
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		
		return "singleBook.jsp";
	}
}
