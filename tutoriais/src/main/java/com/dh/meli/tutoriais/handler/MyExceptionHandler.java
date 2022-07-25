package com.dh.meli.tutoriais.handler;

import com.dh.meli.tutoriais.exception.BadRequestException;
import com.dh.meli.tutoriais.exception.ExceptionDetails;
import com.dh.meli.tutoriais.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionDetails> NotFoundException(NotFoundException ex){
        return new ResponseEntity(
                ExceptionDetails.builder()
                        .titulo("Não encontrado")
                        .mensagem(ex.getMessage())
                        .httpStatus(HttpStatus.NOT_FOUND.value())
                        .localDateTime(LocalDateTime.now())
                        .build(), HttpStatus.NOT_FOUND
        );
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ExceptionDetails> BadRequestException(BadRequestException ex){
        return new ResponseEntity(
                ExceptionDetails.builder()
                        .titulo("Erro na requisição")
                        .mensagem(ex.getMessage())
                        .httpStatus(HttpStatus.BAD_REQUEST.value())
                        .localDateTime(LocalDateTime.now())
                        .build(), HttpStatus.BAD_REQUEST
        );
    }
}
