package com.Java_project.Model;

import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class Empresa {

    List<Vagas> vagasAbertas;

    String nomeEmpresa;
}
