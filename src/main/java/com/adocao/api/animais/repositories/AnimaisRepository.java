/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adocao.api.animais.repositories;

import com.adocao.api.animais.entities.AnimaisJPA;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elisson
 */
@Repository
public interface AnimaisRepository extends JpaRepository<AnimaisJPA, Long> {

    Page<AnimaisJPA> findByNomeContainingIgnoreCase(String nome, Pageable pageable);
    
    Page<AnimaisJPA> findByTipoIgnoreCase(String tipo, Pageable pageable);
}
