package com.br.locadora.repository;

import com.br.locadora.model.VeiculosModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VeiculosRepository extends JpaRepository<VeiculosModel, Long> {

    List<VeiculosModel> findAll();

    List<VeiculosModel> findAllById(int id);

    @Query(value = "select v from VeiculosModel v where v.tipo = 'carro' ") List<VeiculosModel> findAllByTipo();
}
