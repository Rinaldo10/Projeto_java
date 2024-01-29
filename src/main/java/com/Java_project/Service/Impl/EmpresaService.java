package com.Java_project.Service.Impl;

import com.Java_project.Model.Empresa;
import com.Java_project.Repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService implements IEmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    @Override
    public List<Empresa> getEmpresa(){
        return empresaRepository.findAll();
    }

    @Override
    public void patchEmpresa() {

    }

    @Override
    public void deleteEmpresa() {


    }

    @Override
    public void postEmpresa() {

    }

}
