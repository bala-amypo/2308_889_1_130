package com.example.demo.model;
import jakarta.persistence.id;

public class DeviceOwnershipRecord {
    @Id
    private long id;
    @column(unique=true)
    private String serialNumber;
    private String ownerName;
    private String ownerEmail;
    private LocalDate purchaseDate;
    private LocalDare warrantyExpiration;
    private Boolean active;
}