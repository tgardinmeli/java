package com.dh.meli.exerciciospring.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class NotFoundDetalhe {
    String titulo, mensagem;
    LocalDateTime data;
    int status;
}
