package com.Java_project.Model;

import jakarta.persistence.Entity;

import java.util.Date;
import java.util.List;

@Entity
public class Vagas {

    private String nome;

    private String descricao;

    private List<Requisitos> requisitosList;

    private Date prazoVaga;


}
