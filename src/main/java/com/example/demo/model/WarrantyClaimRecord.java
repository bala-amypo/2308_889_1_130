package com.example.demo.model;
import jakarta.persistence.Id;

public class WarrantyClaimRecord{
    @Id
    private Long id;
    private String serialNumber;
    private String claimantName;
    private String claimReason;
    private LocalDateTime submittedAt;
    private 
}