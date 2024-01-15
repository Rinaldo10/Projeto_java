package com.Java_project.Repository;

import com.Java_project.Model.Qualificacoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualificacoesRepository extends JpaRepository<Qualificacoes, Long> {
}
