package com.cliente.industria.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ClienteUseCaseImpl {

    @Autowired
    private RestTemplate restTemplate;

    public String enviar() {
        try {
            String url = "http://localhost:8081/empresa";
            ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
            System.out.println("Resposta:"+forEntity.getBody());
            return forEntity.getBody();
        } catch (Exception e) {
            System.out.println("Erro:"+e.getMessage());
        }
        return null;
    }
}
