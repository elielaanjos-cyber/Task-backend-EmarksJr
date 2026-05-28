package dev.task.biblioteca.controller;

import dev.task.biblioteca.model.Emprestimo;
import dev.task.biblioteca.service.EmprestimoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

    private final EmprestimoService service;

    public EmprestimoController(EmprestimoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Emprestimo> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Emprestimo create(@RequestBody Emprestimo emprestimo) {
        return service.save(emprestimo);
    }

    @PutMapping("/{id}/devolver")
    public Emprestimo devolver(@PathVariable Long id) {
        return service.devolver(id);
    }
}