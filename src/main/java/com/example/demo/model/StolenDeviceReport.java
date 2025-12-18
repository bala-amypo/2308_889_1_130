package com.example.demo.model;
import jakarta.persistence.Id;

public class StolenDeviceReport{
    @Id
    private Long id;
    private String serialNumber;
    private LocalDateTime reportDate;
    private String details;

}