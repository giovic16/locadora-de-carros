package com.br.locadora.service;

import com.br.locadora.model.VeiculosModel;
import com.br.locadora.repository.VeiculosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class VeiculosService {
    private final VeiculosRepository veiculosRepository;

    public List<VeiculosModel> todosVeiculos(){
        return veiculosRepository.findAll();
    }

    public List<VeiculosModel> veiculoPorId(int id) {
        return veiculosRepository.findAllById(id);
    }

    public List<VeiculosModel> exibeCarro(){
        return veiculosRepository.findAllByCarro();
    }

    public List<VeiculosModel> exibeMoto(){
        return veiculosRepository.findAllByMoto();
    }

    public List<VeiculosModel> exibeCaminhao(){
        return veiculosRepository.findAllByCaminhao();
    }

    public void adicionaVeiculo(int ano, String modelo, String marca, String tipo, String combustivel, boolean disponivel){
        veiculosRepository.findAllByAdd(ano, modelo, marca, tipo, combustivel, disponivel);
    }

    public void removeVeiculo(int id){
        veiculosRepository.deleteByIdCustom(id);
    }
}
