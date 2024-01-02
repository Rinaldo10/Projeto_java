package com.Java_project.Service.Impl;

import com.Java_project.Repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TesteService {
    @Autowired
    TesteRepository testeRepository;

    void teste (){
         testeRepository.findAll();
    }
}
