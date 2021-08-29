package pl.coderslab;


import org.springframework.web.bind.annotation.*;
import java.util.List;


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
    public Book showTheBook(@PathVariable Long id){
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