package dev.task.biblioteca.controller;

import dev.task.biblioteca.model.Livros;
import dev.task.biblioteca.service.LivrosService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Livros")
public class LivrosController {

    private final LivrosService service;

    public LivrosController(LivrosService service) {
        this.service = service;
    }

    @GetMapping
    public List<Livros> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Livros create(@RequestBody Livros livros) {
        return service.save(livros);
    }
}