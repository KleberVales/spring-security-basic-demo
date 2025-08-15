package com.example.securitybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Endpoint público - não requer autenticação.";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "Endpoint do usuário - acesso permitido para USER ou ADMIN.";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Endpoint do administrador - acesso permitido apenas para ADMIN.";
    }
}
