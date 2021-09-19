package pl.coderslab.service;

import pl.coderslab.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> getBooks();

    Book addBook(Book bookToAdd);

    Optional<Book> getBookById(Long id);

    void updateBook(Book bookToUpdate);

    void deleteBook(Long id);
}
