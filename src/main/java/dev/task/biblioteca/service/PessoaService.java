package dev.task.biblioteca.service;

public Pessoa update(Long id, Pessoa dados) {
    Pessoa pessoa = getById(id);
    pessoa.setNome(dados.getNome());
    pessoa.setCpf(dados.getCpf());
    pessoa.setEmail(dados.getEmail());
    pessoa.setSenha(dados.getSenha());
    return repository.save(pessoa);
}