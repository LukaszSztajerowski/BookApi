package pl.coderslab;

import java.util.ArrayList;
import java.util.List;

public class MockBookService {
    private List<Book> list;
    private static Long nextId =1L;

    public MockBookService() {
        list = new ArrayList<>();
        list.add(new Book(nextId, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
        nextId +=1;
        list.add(new Book(nextId, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        nextId +=1;

        list.add(new Book(nextId, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
        nextId +=1;

    }

    public List<Book> getList() {
        return list;
    }

    public List<Book> addBook(Book book){

        System.out.println("Dodano nowa ksiazke " + book.getTitle());
        book.setId(nextId);
        list.add(book);
        nextId += 1;
                for (Book elem: list) {
            System.out.println(elem.getTitle());
        }
//        System.out.println(list.size());
        return list;
    }

    public Book showBook(long id){
        Book returnBook = null;
        for (Book book: list) {
            if(book.getId().equals(id)){
               returnBook = book;
            }
        }
        return returnBook;
    }

    public void changeBook(long id, String newAuthor, String newTitle){
        Book returnBook = null;
        for (Book book: list) {
            if(book.getId().equals(id)){
               book.setAuthor(newAuthor);
               book.setTitle(newTitle);
            }
        }
    }

    public void deleteBook(Long id){
        for (Book book: list) {
            if(book.getId().equals(id)){
                list.remove(book);
            }
        }
    }

}
