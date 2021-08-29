package pl.coderslab;

import java.util.List;

public interface BookService {

    List<Book> getBooks();

    Book addBook(Book bookToAdd);

    Book getBookById(Long id);

    void updateBook(Book bookToUpdate);

    void deleteBook(Long id);
}
