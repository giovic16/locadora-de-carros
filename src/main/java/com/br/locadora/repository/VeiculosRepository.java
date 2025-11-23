package com.br.locadora.repository;

import com.br.locadora.model.VeiculosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VeiculosRepository extends JpaRepository<VeiculosModel, Long> {

    List<VeiculosModel> findAll();

}
