package com.Java_project.Controller;

import com.Java_project.DTO.EditEmpresaRequest;
import com.Java_project.Model.Empresa;
import com.Java_project.Service.Impl.IEmpresaService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Empresa Controller", description = "Empresa endpoints")
@RestController
@RequestMapping("/empresa")
@Slf4j
public class EmpresaController {

    //TODO mẽtodos http a serem implementados

    IEmpresaService empresaService;

    public EmpresaController(IEmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping("/listar")
    List<Empresa> getEmpresas(){
        List<Empresa> empresas = empresaService.getEmpresa();
        return empresas;
    }

    @GetMapping("/listar/{id}")
    Empresa getEmpresasById(
        @Parameter(name = "id", required = true) @PathVariable(value = "id") Long id){
        return empresaService.getEmpresaById(id);
    }

    void postEmpresas(){}

    @PatchMapping("/{id}")
    Empresa patchEmpresas(
            @Parameter(name = "editEmpresaRequest", description = "Request json para editar empresa") @RequestBody EditEmpresaRequest request,
            @Parameter(name = "id", description = "Id da empresa a ser editada") @PathVariable(name = "id", required = true) Long id
    ){
        return empresaService.patchEmpresa(request, id);
    }

    @DeleteMapping("/{id}")
    String deleteEmpresas(
            @Parameter(name = "id", description = "Id da empresa a ser editada") @PathVariable(name = "id", required = true) Long id

    ){
        return empresaService.deleteEmpresa(id);
    }
}
