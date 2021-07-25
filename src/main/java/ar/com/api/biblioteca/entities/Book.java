package ar.com.api.biblioteca.entities;
import ar.com.api.biblioteca.entities.Genre;

import java.util.*;

import javax.persistence.*;



@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "book_id")
    private Integer bookId;

    private String title;

    private Author author;

    private String description;

    private Genre genre;// o hacer un many to many donde un libro tiene una lista de generos y generos lista de libros
    
    @Column(name = "publication_year")
    //temporal anotation
    private Date publicationYear;

    private int ISBN13;

    private int ISBN10;




    
}
