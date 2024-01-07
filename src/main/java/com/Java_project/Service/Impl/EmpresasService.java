package com.Java_project.Service.Impl;

import com.Java_project.Repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresasService implements IEmpresasService{
    @Autowired
    TesteRepository testeRepository;

    @Override
    public void getEmpresa(){
         testeRepository.findAll();
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
