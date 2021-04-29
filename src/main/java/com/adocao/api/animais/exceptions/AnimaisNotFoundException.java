/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adocao.api.animais.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author elisson
 */
public class AnimaisNotFoundException extends RuntimeException {

    public AnimaisNotFoundException(Long animais_id) {
        super("{\"id\":" + animais_id +"," + "\"message\":\"não existe.\"}");
    }
}
