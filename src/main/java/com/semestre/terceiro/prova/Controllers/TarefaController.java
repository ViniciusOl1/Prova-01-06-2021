package com.semestre.terceiro.prova.Controllers;

import com.semestre.terceiro.prova.Model.Tarefas;
import com.semestre.terceiro.prova.Repository.TarefaRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tarefas")
@AllArgsConstructor
public class TarefaController {
    private final TarefaRepository repository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Tarefas> list() { return repository.findAll();}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tarefas save(@RequestBody Tarefas tarefas) { return repository.save(tarefas);}
}
