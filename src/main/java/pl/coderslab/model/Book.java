package pl.coderslab.model;

import lombok.*;
import org.hibernate.validator.constraints.ISBN;

import javax.persistence.*;

@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ISBN
    private String isbn;

    private String title;
    private String author;
    private String publisher;
    private String type;

}
