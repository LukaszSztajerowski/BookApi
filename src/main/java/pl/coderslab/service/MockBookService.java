//package pl.coderslab.service;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//import pl.coderslab.model.Book;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class MockBookService implements BookService {
//    private List<Book> list;
//    private static final Logger log = LoggerFactory.getLogger(MockBookService.class);
//
//    private static Long nextId =4L;
//
//    public MockBookService() {
//        list = new ArrayList<>();
//        list.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
//        list.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
//                "programming"));
//        list.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
//                "programming"));
//    }
//
//    public List<Book> getBooks() {
//        return list;
//    }
//
//    public Book addBook(Book bookToAdd){
//
//        log.debug("Dodano nowa ksiazke: {}", bookToAdd);
//        bookToAdd.setId(nextId);
//        list.add(bookToAdd);
//        nextId += 1;
//
//        return bookToAdd;
//    }
//
//    public Optional <Book> getBookById(Long id){
//
//        log.debug("wyswietlam wybraną książkę o id {}", id);
//        Optional <Book> bookById = list.stream().
//                filter(item -> item.getId().equals(id)).findFirst();
//
//        return bookById;
//    }
//
//    public void updateBook(Book bookToUpdated) {
//        log.debug("Aktualizacja książki: {}", bookToUpdated);
//        log.debug("Liczba książek przed aktualizacją: {}", list.size());
//        list.stream()
//                .filter(book -> book.getId().equals(bookToUpdated.getId()))
//                .map(list::indexOf)
//                .findFirst();
//        log.debug("Lista książek po aktualizacji: {}", list.size());
//    }
//
//    public void deleteBook(Long id){
//        log.debug("Liczba książek przed usunięciem: {}", list.size());
//        for (Book book: list) {
//            if(book.getId().equals(id)){
//                list.remove(book);
//            }
//        }
//        log.debug("Liczba książek po usunięciu: {}", list.size());
//
//    }
//
//}
