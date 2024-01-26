package com.Java_project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Empresa {

    @Id
    private Long id;

    private List<Vaga> vagaAbertas;

    private String nomeEmpresa;
}
