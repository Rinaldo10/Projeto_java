package com.Java_project.Controller;

import com.Java_project.Model.Empresa;
import com.Java_project.Service.Impl.IEmpresaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Empresa Controller", description = "Empresa endpoints")
@RestController
@RequestMapping("/empresa")
@Slf4j
public class EmpresaController {

    //TODO mẽtodos http a serem implementados

    IEmpresaService empresaService;


    @GetMapping("/listar")
    List<Empresa> getEmpresas(){
        List<Empresa> empresas = empresaService.getEmpresa();
        return empresas;
    }

    void postEmpresas(){}

    void patchEmpresas(){}

    void deleteEmpresas(){}
}
