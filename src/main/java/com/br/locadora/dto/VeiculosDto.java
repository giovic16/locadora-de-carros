package com.br.locadora.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VeiculosDto {

    @NotNull
    private int id;
    private int ano;
    private String modelo;
    private String marca;
    private String placa;
    private String tipo;
    private String combustivel;
    private boolean disponivel;
}
