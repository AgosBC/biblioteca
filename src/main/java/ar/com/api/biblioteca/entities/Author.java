package ar.com.api.biblioteca.entities;

import javax.persistence.*;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @Column(name = "author_id")
    private Integer authorId;


    private String name;

    @Column(name = "last_name")
    private String lastName;

    private String nationality;

    private String status;

    @Column(name = "alternative_name")
    private String alternativeName;

   
    
}
