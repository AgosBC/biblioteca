package ar.com.api.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.api.biblioteca.entities.Author;
import ar.com.api.biblioteca.entities.Book;
import ar.com.api.biblioteca.repos.AuthorRepository;
@Service
public class AuthorService {

    @Autowired
    private AuthorRepository repo;

    public void create(String name, String lastName, String nationality, boolean status, String altname){

        Author author = new Author();

        author.setName(name);
        author.setLastName(lastName);
        author.setNationality(nationality);
        author.setActive(status);
        author.setAlternativeName(altname);
        

        repo.save(author);
    }
    
}
