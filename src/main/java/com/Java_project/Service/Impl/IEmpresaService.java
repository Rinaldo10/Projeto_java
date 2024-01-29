package com.Java_project.Service.Impl;

import com.Java_project.Model.Empresa;

import java.util.List;

public interface IEmpresaService {

    List<Empresa> getEmpresa();

    void patchEmpresa();
    void deleteEmpresa();
    void postEmpresa();


}
