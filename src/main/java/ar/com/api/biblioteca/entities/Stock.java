package ar.com.api.biblioteca.entities;

import javax.persistence.*;
@Entity
@Table(name = "stock")
public class Stock {

    
    private Book book;

    private Integer amount;

    private Library library;

    
}
