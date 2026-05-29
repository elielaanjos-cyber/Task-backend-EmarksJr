package dev.task.biblioteca.model;

import jakarta.persistence.*;
import lombok.Data;  // ← faltando

@Entity
@Table(name = "pessoas")
@Data
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String email;
    private String senha;
}