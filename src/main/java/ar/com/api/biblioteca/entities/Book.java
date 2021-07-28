package ar.com.api.biblioteca.entities;
import ar.com.api.biblioteca.entities.Genre;

import java.util.*;

import javax.persistence.*;



@Entity
@Table(name = "book")
public class Book {

    
    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "author_id")
    private Author author;

    private String description;

    @ManyToMany(mappedBy = "books")
    private List<Genre> genres = new ArrayList<>();// o hacer un many to many donde un libro tiene una lista de generos y generos lista de libros
    
    @Column(name = "publication_year")
    //temporal anotation
    private Date publicationYear;

    private int ISBN13;

    private int ISBN10;

    @ManyToMany(mappedBy = "books")
    private List<Author> authors = new ArrayList<>();

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

    
    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
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

    public void addAuthor(Author author){
        this.authors.add(author);
    }

    public void addGenre(Genre genre){
        this.genres.add(genre);
    }

    




    
}
