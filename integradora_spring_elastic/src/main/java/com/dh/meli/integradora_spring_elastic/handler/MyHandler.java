package com.dh.meli.integradora_spring_elastic.handler;

import com.dh.meli.integradora_spring_elastic.exception.BadRequestException;
import com.dh.meli.integradora_spring_elastic.exception.ExceptionDetails;
import com.dh.meli.integradora_spring_elastic.exception.NotFoundException;
import com.dh.meli.integradora_spring_elastic.model.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class MyHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionDetails> notFoundException(NotFoundException ex){
        return new ResponseEntity(ExceptionDetails.builder()
                .title("Não encontrado!")
                .description(ex.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .localDateTime(LocalDateTime.now())
                .build(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ExceptionDetails> BadRequestException(BadRequestException ex){
        return new ResponseEntity(ExceptionDetails.builder()
                .title("Requisição inválida")
                .description(ex.getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .localDateTime(LocalDateTime.now())
                .build(), HttpStatus.BAD_REQUEST);
    }


    public ResponseEntity<Message> messageResponseEntity(String message){
        return new ResponseEntity(Message.builder()
                .message(message)
                .build(), HttpStatus.OK);
    }
}
