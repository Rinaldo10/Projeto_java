package com.Java_project.Repository;

import com.Java_project.Model.Vagas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class VagasRepository implements JpaRepository<Vagas, Long> {
}
