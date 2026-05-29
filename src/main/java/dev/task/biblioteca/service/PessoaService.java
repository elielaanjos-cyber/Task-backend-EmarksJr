package dev.task.biblioteca.service;

import dev.task.biblioteca.model.Pessoa;
import dev.task.biblioteca.repository.PessoaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public List<Pessoa> getAll() {
        return repository.findAll();
    }

    public Pessoa save(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public Pessoa getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
    }

    public Pessoa update(Long id, Pessoa dados) {
        Pessoa pessoa = getById(id);
        pessoa.setNome(dados.getNome());
        pessoa.setCpf(dados.getCpf());
        pessoa.setEmail(dados.getEmail());
        pessoa.setSenha(dados.getSenha());
        return repository.save(pessoa);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}