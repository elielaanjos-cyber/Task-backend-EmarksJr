package dev.task.biblioteca.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "livros")
@Data
public class Livros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String autor;
    @Column(name = "data_lancamento")
    private LocalDate dataLancamento;
    private Integer quantidade;
}