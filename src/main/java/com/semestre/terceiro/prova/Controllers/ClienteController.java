package com.semestre.terceiro.prova.Controllers;

import com.semestre.terceiro.prova.Model.Clientes;
import com.semestre.terceiro.prova.Repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
@AllArgsConstructor
public class ClienteController {
    private final ClienteRepository repository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Clientes> list() { return repository.findAll();}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Clientes save(@RequestBody Clientes clientes) { return repository.save(clientes);}
}
