package com.example.porto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.porto.model.dao.PrestadorRepository;
import com.example.porto.model.vo.Prestador;
/**
 * @author Kauê rm97768, Thomas rm99832, Gabriel rm98986, Matheus Giusto rm99969, Matheus Dantas rm98406
 * @see Classe Controller que faz o gerenciamento dos métodos GET, POST, PUT e DELETE do Prestador
 */
@RestController
@RequestMapping(value = "/prestador")
public class PrestadorController {
	@Autowired
    private PrestadorRepository repository;

    @GetMapping
    public List<Prestador> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Prestador findById(@PathVariable Long id) {
    	Prestador result = repository.findById(id).get();
       return result;
    }
    
    @PostMapping
    public ResponseEntity<Prestador> createPrestador(@RequestBody Prestador prestador) {
    	Prestador savedPrestador = repository.save(prestador);
        return new ResponseEntity<>(savedPrestador, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrestador(@PathVariable Long id) {
        if (repository.existsById(id)) {
        	repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Prestador> updatePrestador(@PathVariable Long id, @RequestBody Prestador updatedPrestador) {
        if (repository.existsById(id)) {
            updatedPrestador.setId_prestador(id);
            Prestador savedPrestador = repository.save(updatedPrestador);
            return new ResponseEntity<>(savedPrestador, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
