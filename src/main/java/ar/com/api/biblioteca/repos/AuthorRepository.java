package ar.com.api.biblioteca.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.api.biblioteca.entities.Author;
@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    
}
