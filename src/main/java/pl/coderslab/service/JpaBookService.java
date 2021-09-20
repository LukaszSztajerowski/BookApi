package pl.coderslab.service;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.model.Book;

import java.util.List;
import java.util.Optional;

@Data
@Service
@Primary
public class JpaBookService implements BookService{

    private final BookRepository bookRepository;

    @Override
    public List<Book> getBooks() {
        List<Book> bookList = bookRepository.findAll();
        return bookList;
    }

    @Override
    public Book addBook(Book bookToAdd) {
        bookRepository.save(bookToAdd);
        return bookToAdd;
    }

    @Override
    public Optional<Book> getBookById(Long id) {
        Optional<Book> bookById = bookRepository.findById(id);
        return bookById;
    }

    @Override
    public void updateBook(Book bookToUpdate) {
        bookRepository.save(bookToUpdate);
    }

    @Override
    public void deleteBook(Long id) {
        Optional<Book> bookById = bookRepository.findById(id);
        if(bookById.isPresent()){
        bookRepository.deleteById(id);
        }
    }
}
