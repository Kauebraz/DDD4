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

import com.example.porto.model.dao.SinistroRepository;
import com.example.porto.model.vo.Sinistro;
/**
 * @author Kauê rm97768, Thomas rm99832, Gabriel rm98986, Matheus Giusto rm99969, Matheus Dantas rm98406
 * @see Classe Controller que faz o gerenciamento dos métodos GET, POST, PUT e DELETE do Sinistro
 */
@RestController
@RequestMapping(value = "/sinistro")
public class SinistroController {
	@Autowired
    private SinistroRepository repository;

    @GetMapping
    public List<Sinistro> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Sinistro findById(@PathVariable Long id) {
    	Sinistro result = repository.findById(id).get();
       return result;
    }
    
    @PostMapping
    public ResponseEntity<Sinistro> createSinistro(@RequestBody Sinistro sinistro) {
    	Sinistro savedSegurado = repository.save(sinistro);
        return new ResponseEntity<>(savedSegurado, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSinistro(@PathVariable Long id) {
        if (repository.existsById(id)) {
        	repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Sinistro> updateSegurado(@PathVariable Long id, @RequestBody Sinistro updatedSinistro) {
        if (repository.existsById(id)) {
        	updatedSinistro.setId_sinistro(id);
            Sinistro savedSegurado = repository.save(updatedSinistro);
            return new ResponseEntity<>(savedSegurado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
