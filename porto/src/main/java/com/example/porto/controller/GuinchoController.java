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

import com.example.porto.model.dao.GuinchoRepository;
import com.example.porto.model.vo.Guincho;
/**
 * @author Kauê rm97768, Thomas rm99832, Gabriel rm98986, Matheus Giusto rm99969, Matheus Dantas rm98406
 * @see Classe Controller que faz o gerenciamento dos métodos GET, POST, PUT e DELETE do Guincho
 */
@RestController
@RequestMapping(value = "/guincho")
public class GuinchoController {
	@Autowired
    private GuinchoRepository repository;

    @GetMapping
    public List<Guincho> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Guincho findById(@PathVariable Long id) {
    	Guincho result = repository.findById(id).get();
    	return result;
    }
    
    @PostMapping
    public ResponseEntity<Guincho> createGuincho(@RequestBody Guincho guincho) {
    	Guincho savedGuincho = repository.save(guincho);
        return new ResponseEntity<>(savedGuincho, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGuincho(@PathVariable Long id) {
        if (repository.existsById(id)) {
        	repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Guincho> updateGuincho(@PathVariable Long id, @RequestBody Guincho updatedGuincho) {
        if (repository.existsById(id)) {
        	updatedGuincho.setId_guincho(id);
        	Guincho savedGuincho = repository.save(updatedGuincho);
            return new ResponseEntity<>(savedGuincho, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
