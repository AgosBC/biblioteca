package ar.com.api.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.api.biblioteca.entities.Author;
import ar.com.api.biblioteca.models.response.GenericResponse;
import ar.com.api.biblioteca.services.AuthorService;

@RestController
public class AuthorController {

    @Autowired
    public AuthorService service;

    @PostMapping("/autores")
    public ResponseEntity<GenericResponse> create(@RequestBody Author author){

        GenericResponse response = new GenericResponse();

        service.create(author.getName(), author.getLastName(), author.getNationality(), author.getActive(), author.getAlternativeName());

        response.isOk = true;
        response.menssage = "autor creado con exito";
        response.id = author.getAuthorId();

        return ResponseEntity.ok(response);

        

    

        
    }
    
}
