package com.Java_project.Service.Impl;

import com.Java_project.DTO.EditEmpresaRequest;
import com.Java_project.Model.Empresa;
import com.Java_project.Repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService implements IEmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    @Override
    public List<Empresa> getEmpresa(){
        return empresaRepository.findAll();
    }

    @Override
    public Empresa getEmpresaById(Long id){
        Optional<Empresa> empresa =  empresaRepository.findById(id);
        if (empresa.isPresent()){
            return empresa.get();
        }
        return new Empresa();
    }

    @Override
    public Empresa patchEmpresa(EditEmpresaRequest request, Long id) {
        Empresa empresaUpdated = empresaRepository.editEmpresa(request, id);
        return empresaUpdated;
    }

    @Override
    public String deleteEmpresa(Long id) {
        try{
            empresaRepository.deleteById(id);
            return ("Empresa deleta com sucesso - 200 OK");

        } catch (Exception exception){
            return ("Não foi possivel deletar a empresa, verifique se o id esta correto.");
        }

    }

    @Override
    public void postEmpresa() {


    }

}
