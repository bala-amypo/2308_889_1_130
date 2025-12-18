package com.example.demo.model;
import jakarta.persistence.Id;

public class FraudAlertRecord{
    @Id
    private Long id;
    private Long ClaimId;
    private String serialNumber;
    private String alertType;
    private String severity;
    private String message;
    private LocalDateTime alertDate;
    private Boolean resolved;
}