package com.example.demo.model;
import jakarta.persistence.Id;

public class User{
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private LocalDateTime createdAt;
}