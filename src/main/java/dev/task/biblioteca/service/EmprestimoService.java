package dev.task.biblioteca.service;

import dev.task.biblioteca.model.Emprestimo;
import dev.task.biblioteca.repository.EmprestimoRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class EmprestimoService {

    private final EmprestimoRepository repository;

    public EmprestimoService(EmprestimoRepository repository) {
        this.repository = repository;
    }

    // Listar todos
    public List<Emprestimo> getAll() {
        return repository.findAll();
    }

    // Emprestar livro
    public Emprestimo save(Emprestimo emprestimo) {
        emprestimo.setDataEmprestimo(LocalDate.now());
        return repository.save(emprestimo);
    }

    // Devolver livro
    public Emprestimo devolver(Long id) {
        Emprestimo emprestimo = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Emprestimo não encontrado"));
        emprestimo.setDataDevolucao(LocalDate.now());
        return repository.save(emprestimo);
    }
}