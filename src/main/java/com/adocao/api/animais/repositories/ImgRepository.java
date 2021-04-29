/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adocao.api.animais.repositories;

import com.adocao.api.animais.entities.ImgJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elisson
 */
@Repository
public interface ImgRepository extends JpaRepository<ImgJPA, Long>{
    
}
