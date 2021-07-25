package ar.com.api.biblioteca.entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "genre")
public class Genre {

    @Id
    @Column(name = "genre_id")
    private int genreId;

    private String name;

    private List<Book> books = new ArrayList<>();
    
}
