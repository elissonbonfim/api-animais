/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adocao.api.animais.exceptions;

/**
 *
 * @author elisson
 */
public class AnimaisNotFoundException extends RuntimeException {

    public AnimaisNotFoundException(Long animais_id) {
        super("{\"animais_id\":" + animais_id +"," + "\"message\":\"não existe.\"}");
    }
}
