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
}
