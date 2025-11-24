package com.br.locadora.controller;

import com.br.locadora.dto.VeiculosDto;
import com.br.locadora.model.VeiculosModel;
import com.br.locadora.service.VeiculosService;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/veiculos")
@RequiredArgsConstructor
public class VeiculosController {
    private final VeiculosService veiculosService;

    @GetMapping("/geral")
    public List<VeiculosModel> listaVeiculos() {
        return veiculosService.todosVeiculos();
    }

    @GetMapping("/id")
    public List<VeiculosModel> buscaPorId(@Parameter int id) {
        return veiculosService.veiculoPorId(id);
    }

    @GetMapping("/carro")
    public List<VeiculosModel> buscaPorCarro(){
        return veiculosService.exibeCarro();
    }
}
