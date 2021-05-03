/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adocao.api.animais.controllers;

import com.adocao.api.animais.entities.AnimaisJPA;
import com.adocao.api.animais.exceptions.AnimaisNotFoundException;
import com.adocao.api.animais.repositories.AnimaisRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author elisson
 */
@RestController
@RequestMapping(value = "/animais")
public class AnimaisController {

    @Autowired
    AnimaisRepository repository;

//    @GetMapping
//    public ResponseEntity<List<AnimaisJPA>> findAll() {
//        List<AnimaisJPA> result = repository.findAll();
//        return ResponseEntity.ok(result);
//    }
    @GetMapping
    public ResponseEntity<Page<AnimaisJPA>> findAll(@PageableDefault(size = 20) Pageable pageable) {
        Page<AnimaisJPA> result = repository.findAll(pageable);
        return ResponseEntity.ok(result);
    }
    
    @GetMapping("/id")
    public AnimaisJPA findById(@RequestParam(defaultValue = "") Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new AnimaisNotFoundException(id));
    }

    @GetMapping("/name")
    public Page<AnimaisJPA> findByName(@RequestParam(defaultValue = "") String nome, Pageable pageable) {
        Page<AnimaisJPA> result = repository.findByNomeContainingIgnoreCase(nome, pageable);
        return result;
    }

    @GetMapping("/tipo")
    public Page<AnimaisJPA> findByType(@RequestParam(defaultValue = "") String tipo, Pageable pageable) {
        Page<AnimaisJPA> result = repository.findByTipoIgnoreCase(tipo, pageable);
        return result;
    }
}
