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
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class AnimaisNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(AnimaisNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String animaisNotFoundHandler(AnimaisNotFoundException ex) {
    return ex.getMessage();
  }
}
