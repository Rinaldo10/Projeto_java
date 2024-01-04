package com.Java_project.Repository;

import com.Java_project.Model.Requisitos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class TesteRepository extends JpaRepository<Requisitos, Long> {


}
