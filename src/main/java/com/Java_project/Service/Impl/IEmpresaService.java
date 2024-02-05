package com.Java_project.Service.Impl;

import com.Java_project.DTO.CreateRequest;
import com.Java_project.DTO.EditEmpresaRequest;
import com.Java_project.Model.Empresa;

import java.util.List;

public interface IEmpresaService {

    List<Empresa> getEmpresa();
    Empresa getEmpresaById(Long id);

    Empresa patchEmpresa(EditEmpresaRequest request, Long id);
    String deleteEmpresa(Long id);
    Empresa postEmpresa(CreateRequest request);


}
