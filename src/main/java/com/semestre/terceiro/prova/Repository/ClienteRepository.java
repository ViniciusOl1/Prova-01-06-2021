package com.semestre.terceiro.prova.Repository;

import com.semestre.terceiro.prova.Model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Clientes, Long> {
}
