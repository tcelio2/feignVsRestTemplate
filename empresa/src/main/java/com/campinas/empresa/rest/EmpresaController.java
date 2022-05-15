package com.campinas.empresa.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("empresa")
public class EmpresaController {


    @GetMapping
    public String getBoasVindas() {
        return "Ola! Obrigado por se comunicar conosco!";
    }
}
