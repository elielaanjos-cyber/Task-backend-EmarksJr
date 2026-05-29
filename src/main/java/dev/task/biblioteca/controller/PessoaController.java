package dev.task.biblioteca.controller;

import dev.task.biblioteca.model.Pessoa;
import dev.task.biblioteca.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pessoa> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Pessoa create(@RequestBody Pessoa pessoa) {
        return service.save(pessoa);
    }

    @GetMapping("/{id}")
    public Pessoa getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Pessoa update(@PathVariable Long id, @RequestBody Pessoa pessoa) {
        return service.update(id, pessoa);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}