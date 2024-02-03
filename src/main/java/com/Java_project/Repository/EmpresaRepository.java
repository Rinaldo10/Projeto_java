package com.Java_project.Repository;

import com.Java_project.DTO.EditEmpresaRequest;
import com.Java_project.Model.Empresa;
import com.Java_project.Model.Requisito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    @Query
    Empresa updateEmpresa(EditEmpresaRequest request, Long id);

}
