package br.dh.meli.perolas.exception;

import lombok.Builder;
import lombok.Data;

public class CadastroJaExisteException extends RuntimeException {
    public CadastroJaExisteException(String message) {
        super(message);
    }
}
