package com.br.locadora.controller;

import com.br.locadora.dto.VeiculosDto;
import com.br.locadora.model.VeiculosModel;
import com.br.locadora.service.VeiculosService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
}
