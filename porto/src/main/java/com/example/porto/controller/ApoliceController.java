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

import com.example.porto.model.dao.ApoliceRepository;
import com.example.porto.model.vo.Apolice;
/**
 * @author Kauê rm97768, Thomas rm99832, Gabriel rm98986, Matheus Giusto rm99969, Matheus Dantas rm98406
 * @see Classe Controller que faz o gerenciamento dos métodos GET, POST, PUT e DELETE da Apolice
 */
@RestController
@RequestMapping(value = "/apolice")
public class ApoliceController {
	@Autowired
    private ApoliceRepository repository;

    @GetMapping
    public List<Apolice> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Apolice findById(@PathVariable Long id) {
    	Apolice result = repository.findById(id).get();
    	return result;
    }
    
    @PostMapping
    public ResponseEntity<Apolice> createApolice(@RequestBody Apolice apolice) {
		Apolice savedSegurado = repository.save(apolice);
        return new ResponseEntity<>(savedSegurado, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApolice(@PathVariable Long id) {
        if (repository.existsById(id)) {
        	repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Apolice> updateApolice(@PathVariable Long id, @RequestBody Apolice updatedApolice) {
        if (repository.existsById(id)) {
        	updatedApolice.setId_apolice(id);
            Apolice savedApolice = repository.save(updatedApolice);
            return new ResponseEntity<>(savedApolice, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
