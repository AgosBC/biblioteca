package ar.com.api.biblioteca.services;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.api.biblioteca.entities.Author;
import ar.com.api.biblioteca.repos.AuthorRepository;

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
