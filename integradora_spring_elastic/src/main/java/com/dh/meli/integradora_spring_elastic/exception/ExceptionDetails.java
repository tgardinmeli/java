package com.dh.meli.integradora_spring_elastic.exception;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExceptionDetails {
    private String title;
    private String description;
    private int status;
    private LocalDateTime localDateTime;

}
