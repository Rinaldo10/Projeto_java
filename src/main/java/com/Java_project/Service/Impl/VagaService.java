package com.Java_project.Service.Impl;

import com.Java_project.Repository.EmpresaRepository;
import org.springframework.stereotype.Service;

@Service
public class VagaService implements IVagaService {

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
