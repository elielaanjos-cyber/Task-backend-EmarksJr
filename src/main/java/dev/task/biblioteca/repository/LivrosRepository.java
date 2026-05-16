package dev.task.biblioteca.repository;

import dev.task.biblioteca.model.Livros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrosRepository extends JpaRepository<Livros, Long> {
}