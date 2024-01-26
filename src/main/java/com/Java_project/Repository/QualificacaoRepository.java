package com.Java_project.Repository;

import com.Java_project.Model.Qualificacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualificacaoRepository extends JpaRepository<Qualificacao, Long> {
}
