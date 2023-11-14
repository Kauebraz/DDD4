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

import com.example.porto.model.dao.VeiculoRepository;
import com.example.porto.model.vo.Veiculo;
/**
 * @author Kauê rm97768, Thomas rm99832, Gabriel rm98986, Matheus Giusto rm99969, Matheus Dantas rm98406
 * @see Classe Controller que faz o gerenciamento dos métodos GET, POST, PUT e DELETE do Veiculo
 */
@RestController
@RequestMapping(value = "/veiculo")
public class VeiculoController {
	@Autowired
    private VeiculoRepository repository;

    @GetMapping
    public List<Veiculo> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Veiculo findById(@PathVariable Long id) {
    	Veiculo result = repository.findById(id).get();
       return result;
    }
    
    @PostMapping
    public ResponseEntity<Veiculo> createVeiculo(@RequestBody Veiculo veiculo) {
    	Veiculo savedSegurado = repository.save(veiculo);
        return new ResponseEntity<>(savedSegurado, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVeiculo(@PathVariable Long id) {
        if (repository.existsById(id)) {
        	repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> updateVeiculo(@PathVariable Long id, @RequestBody Veiculo updatedSinistro) {
        if (repository.existsById(id)) {
        	updatedSinistro.setId_veiculo(id);
        	Veiculo savedSegurado = repository.save(updatedSinistro);
            return new ResponseEntity<>(savedSegurado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}