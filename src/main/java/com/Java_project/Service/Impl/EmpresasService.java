package com.Java_project.Service.Impl;

import com.Java_project.Repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresasService implements IEmpresasService{
    @Autowired
    EmpresaRepository empresaRepository;

    @Override
    public void getEmpresa(){
         empresaRepository.findAll();
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
