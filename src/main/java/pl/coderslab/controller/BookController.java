package pl.coderslab.controller;


import org.springframework.web.bind.annotation.*;
import pl.coderslab.service.BookService;
import pl.coderslab.model.Book;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/books")
public class BookController {
    private BookService bookService;


    @GetMapping("")
    public List<Book> getBooks() {
       return bookService.getBooks();
    }

    @PostMapping("")
    public Book addBook (@RequestBody Book book) {
        return bookService.addBook(book);
    }


    @GetMapping("/{id:\\d+}")
    public Optional<Book> showTheBook(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @PutMapping("/{id:\\d+")
    public Book updateBook (@PathVariable Long id, @RequestBody Book book){
        book.setId(id);
        bookService.updateBook(book);
        return book;
    }

    @DeleteMapping("/{id:\\d+}")
    public void deleteBook (@PathVariable Long id){
        bookService.deleteBook(id);
    }
}