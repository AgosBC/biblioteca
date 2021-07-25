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

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "author_id")
    private Author author;

    private String description;

    private Genre genre;// o hacer un many to many donde un libro tiene una lista de generos y generos lista de libros
    
    @Column(name = "publication_year")
    //temporal anotation
    private Date publicationYear;

    private int ISBN13;

    private int ISBN10;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
        author.addBook(this);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Date getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Date publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getISBN13() {
        return ISBN13;
    }

    public void setISBN13(int iSBN13) {
        ISBN13 = iSBN13;
    }

    public int getISBN10() {
        return ISBN10;
    }

    public void setISBN10(int iSBN10) {
        ISBN10 = iSBN10;
    }


    




    
}
