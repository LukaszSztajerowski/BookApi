package pl.coderslab.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.model.Book;
import pl.coderslab.service.BookService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@Data
public class ManageBookController {
    private final BookService bookService;

    public ManageBookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books/all")
    public String showBooks(Model model) {
        List<Book> books = bookService.getBooks();
        model.addAttribute("books", books);
        return "allBooks";
    }

    @GetMapping("/books/add")
    public String addBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "addBook";
    }

    @PostMapping("/books/add")
    public String save(@Valid Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "addBook";
        }
        bookService.addBook(book);
        return "allBooks";
    }

    @GetMapping("/books/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        Optional<Book> bookById = bookService.getBookById(id);
        if (bookById.isPresent()) {
            model.addAttribute("book", bookById);
            return "editBook";
        } else {
            return "redirect:/books/all";
        }
    }

    @PostMapping("book/edit/{id}")
    public String editBook(@PathVariable Long id, @Valid Book book, BindingResult result) {
        if (result.hasErrors()){
            return "book/edit/{"+id+"}";
        }
        book.setId(id);
        bookService.addBook(book);
        return "allBooks";
    }

    @GetMapping("books/delete/{id}")
    public String deleteBook(@PathVariable Long id){
        Optional<Book> bookById = bookService.getBookById(id);
        if(bookById.isPresent()){
            bookService.deleteBook(id);
            return "allBooks";
        }else{
            return "allBooks";
        }
    }

    @GetMapping("/books/show/{id}")
    public String showBook(@PathVariable Long id, Model model){
        if(bookService.getBookById(id).isPresent()){
            model.addAttribute("book", bookService.getBookById(id));
            return "showBook";
        }
        return "allBooks";
    }

}
