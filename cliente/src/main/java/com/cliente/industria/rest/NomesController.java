package com.cliente.industria.rest;

import com.cliente.industria.gateway.EmpresaFeignClient;
import com.cliente.industria.usecase.ClienteUseCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NomesController {

    @Autowired
    private ClienteUseCaseImpl clienteUseCase;

    @Autowired
    private EmpresaFeignClient empresaFeignClient;

    @GetMapping("cliente")
    public String getNomes() {
        return clienteUseCase.enviar();
    }

    @GetMapping("cliente2")
    public String getNomes2() {
        String nome = empresaFeignClient.getNome();
        System.out.println(nome);
        return nome;
    }

}
