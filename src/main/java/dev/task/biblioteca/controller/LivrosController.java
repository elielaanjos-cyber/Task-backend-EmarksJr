package dev.task.biblioteca.controller;

import dev.task.biblioteca.model.Livros;
import dev.task.biblioteca.service.LivrosService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
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
    @GetMapping("/{id}")
    public Livros getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Livros update(@PathVariable Long id, @RequestBody Livros livros) {
        return service.update(id, livros);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}