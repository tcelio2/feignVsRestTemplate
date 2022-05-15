package com.cliente.industria.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "EmpresaFeign", url = "http://localhost:8081")
public interface EmpresaFeignClient {

    @GetMapping(value = "empresa")
    String getNome();
}
