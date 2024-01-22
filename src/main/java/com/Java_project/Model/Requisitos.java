package com.Java_project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Requisitos {

    @Id
    private String nome;

    private Integer tempoExperiencia;
}
