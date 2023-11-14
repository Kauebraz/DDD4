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

import com.example.porto.model.bo.SeguradoBO;
import com.example.porto.model.dao.SeguradoRepository;
import com.example.porto.model.vo.Segurado;
/**
 * @author Kauê rm97768, Thomas rm99832, Gabriel rm98986, Matheus Giusto rm99969, Matheus Dantas rm98406
 * @see Classe Controller que faz o gerenciamento dos métodos GET, POST, PUT e DELETE do Segurado
 */
@RestController
@RequestMapping(value = "/segurado")
public class SeguradoController {
	@Autowired
    private SeguradoRepository repository;

    @GetMapping
    public List<Segurado> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Segurado findById(@PathVariable Long id) {
       Segurado result = repository.findById(id).get();
       return result;
    }
    
    @PostMapping
    public ResponseEntity<Segurado> createSegurado(@RequestBody Segurado segurado) {
    	SeguradoBO seguradoBO = new SeguradoBO(repository);
		seguradoBO.validateCpfCnpjUnique(segurado);
    	Segurado savedSegurado = repository.save(segurado);
        return new ResponseEntity<>(savedSegurado, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSegurado(@PathVariable Long id) {
        if (repository.existsById(id)) {
        	repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Segurado> updateSegurado(@PathVariable Long id, @RequestBody Segurado updatedSegurado) {
        if (repository.existsById(id)) {
            updatedSegurado.setId_segurado(id);
            Segurado savedSegurado = repository.save(updatedSegurado);
            return new ResponseEntity<>(savedSegurado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
	