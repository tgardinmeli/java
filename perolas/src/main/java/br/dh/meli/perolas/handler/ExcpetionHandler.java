package br.dh.meli.perolas.handler;

import br.dh.meli.perolas.exception.CadastroJaExisteException;
import br.dh.meli.perolas.exception.ExceptionDetalhes;
import br.dh.meli.perolas.exception.JoiaNaoExisteException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ExcpetionHandler {

    @ExceptionHandler(CadastroJaExisteException.class)
    public ResponseEntity<ExceptionDetalhes> cadastroExistente(CadastroJaExisteException ex){
            return new ResponseEntity(
                    ExceptionDetalhes.builder()
                            .titulo("Objeto já cadastrado")
                            .mensagem(ex.getMessage())
                            .status(HttpStatus.BAD_REQUEST.value())
                            .timestamp(LocalDateTime.now())
                            .build(),
                    HttpStatus.BAD_REQUEST
            );

    }

    @ExceptionHandler(JoiaNaoExisteException.class)
    public ResponseEntity<ExceptionDetalhes> cadastroExistente(JoiaNaoExisteException ex){
        return new ResponseEntity(
                ExceptionDetalhes.builder()
                        .titulo("Objeto não cadastrado")
                        .mensagem(ex.getMessage())
                        .status(HttpStatus.BAD_REQUEST.value())
                        .timestamp(LocalDateTime.now())
                        .build(),
                HttpStatus.BAD_REQUEST
        );

    }
}
