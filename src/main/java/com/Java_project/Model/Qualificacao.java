package com.Java_project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Qualificacao {

    @Id
    private Integer id;

    private String description;
}
