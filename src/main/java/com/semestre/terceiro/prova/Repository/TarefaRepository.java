package com.semestre.terceiro.prova.Repository;

import com.semestre.terceiro.prova.Model.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefas, Long> {
}
