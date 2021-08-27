package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @GetMapping("")
    @ResponseBody
    public List<Book> showBooks(MockBookService mockBookService) {

        List<Book> testowe = mockBookService.getList();
        System.out.println(testowe);
        return mockBookService.getList();
    }


    @PostMapping("/add")
    public List<Book> addNewBook(MockBookService mockBookService, @RequestBody Book book) {
        List<Book> test = mockBookService.addBook(book);
        for(Book elem: test) {
            System.out.println(elem.getTitle());
        }
        return mockBookService.getList();
    }

    @GetMapping("/{id}")
    public Book showThisBook(Long id, MockBookService mockBookService){
        return mockBookService.showBook(id);
    }

    @PutMapping("")
    public void changeBook (MockBookService mockBookService, Long id, @RequestBody Book book){
        mockBookService.changeBook(id,book.getAuthor(), book.getTitle());
    }

    @DeleteMapping("/{id}")
    public void deleteBook (Long id, MockBookService mockBookService){
        mockBookService.deleteBook(id);
    }
}