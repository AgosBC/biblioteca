package ar.com.api.biblioteca.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.api.biblioteca.entities.Author;
import ar.com.api.biblioteca.services.AuthorService;

@RestController
public class AuthorController {

    AuthorService service;

    public ResponseEntity<GenericResponse> create(@RequestBody Author author){

        
    }
    
}
