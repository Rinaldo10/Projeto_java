package com.Java_project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.List;

@Entity
public class Vagas {

    @Id
    private Long id;
    private String nome;

    private String descricao;

    private List<Requisitos> requisitosList;

    private Date prazoVaga;


}
