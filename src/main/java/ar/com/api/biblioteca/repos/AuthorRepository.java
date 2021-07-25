package ar.com.api.biblioteca.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.api.biblioteca.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    
}
