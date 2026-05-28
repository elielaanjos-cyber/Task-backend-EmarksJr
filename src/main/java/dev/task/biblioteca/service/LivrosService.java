package dev.task.biblioteca.service;

import dev.task.biblioteca.model.Livros;
import dev.task.biblioteca.repository.LivrosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivrosService {

    private final LivrosRepository repository;

    public LivrosService(LivrosRepository repository) {
        this.repository = repository;
    }

    // Listar todos
    public List<Livros> getAll() {
        return repository.findAll();
    }

    // Criar livro
    public Livros save(Livros livros) {
        return repository.save(livros);
    }

    // Deletar livro
    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Livros getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));
    }

    public Livros update(Long id, Livros dados) {
        Livros livro = getById(id);
        livro.setNome(dados.getNome());
        livro.setAutor(dados.getAutor());
        livro.setDataLancamento(dados.getDataLancamento());
        livro.setQuantidade(dados.getQuantidade());
        return repository.save(livro);
    }
}