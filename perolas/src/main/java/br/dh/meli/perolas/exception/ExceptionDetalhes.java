package br.dh.meli.perolas.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ExceptionDetalhes {
    private String titulo;
    private int status;
    private String mensagem;
    private LocalDateTime timestamp;

}
