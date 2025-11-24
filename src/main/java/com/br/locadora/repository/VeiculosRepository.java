package com.br.locadora.repository;

import com.br.locadora.model.VeiculosModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VeiculosRepository extends JpaRepository<VeiculosModel, Long> {

    List<VeiculosModel> findAll();

    List<VeiculosModel> findAllById(int id);

    @Query(value = "select v from VeiculosModel v where v.tipo = 'carro' ") List<VeiculosModel> findAllByCarro();

    @Query(value = "select v from VeiculosModel v where v.tipo = 'moto' ") List<VeiculosModel> findAllByMoto();

    @Query(value = "select v from VeiculosModel v where v.tipo = 'Caminhão' ") List<VeiculosModel> findAllByCaminhao();

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO VeiculosModel (ano, modelo, marca, tipo, combustivel, disponivel) VALUES (:ano, :modelo, :marca, :tipo, :combustivel, :disponivel)"
    ) void findAllByAdd(@Param("ano") int ano, @Param("modelo") String modelo, @Param("marca") String marca,
               @Param("tipo") String tipo, @Param("combustivel") String combustivel, @Param("disponivel") boolean disponivel);
}
