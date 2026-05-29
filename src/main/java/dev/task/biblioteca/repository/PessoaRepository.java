package dev.task.biblioteca.repository;

import dev.task.biblioteca.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}