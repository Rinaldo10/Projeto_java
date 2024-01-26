package com.Java_project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Profissional {

    @Id
    private Long id;
    private String nome;
    private List<Qualificacao> qualificacaoList;
}
