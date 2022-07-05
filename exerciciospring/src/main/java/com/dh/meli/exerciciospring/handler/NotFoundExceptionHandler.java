package com.dh.meli.exerciciospring.handler;

import com.dh.meli.exerciciospring.exception.NotFoundDetalhe;
import com.dh.meli.exerciciospring.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice

public class NotFoundExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<NotFoundException> notFoundException(NotFoundException ex){
        return new ResponseEntity(NotFoundDetalhe.builder()
                .titulo("Não Encontrado")
                .data(LocalDateTime.now())
                .mensagem(ex.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .build(),
                HttpStatus.NOT_FOUND);
    }
}
