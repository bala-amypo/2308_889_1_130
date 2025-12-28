package com.example.demo.controller;

import com.example.demo.service.impl.WarrantyClaimServiceImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarrantyClaimController {
    private final WarrantyClaimServiceImpl service;
    
    public WarrantyClaimController(WarrantyClaimServiceImpl service) {
        this.service = service;
    }
}

Dto:
authrq:



package com.example.demo.dto;

public class AuthRequest {
    private String email;
    private String password;
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
