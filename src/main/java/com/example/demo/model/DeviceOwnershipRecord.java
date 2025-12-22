package com.example.demo.model;
import jakarta.persistence.Id;
import java.time.LocalDate;

public class DeviceOwnershipRecord {
    @Id
    private long id;
    @column(unique=true)
    private String serialNumber;
    private String ownerName;
    private String ownerEmail;
    private LocalDate purchaseDate;
    private LocalDate warrantyExpiration;
    private Boolean active;
} 