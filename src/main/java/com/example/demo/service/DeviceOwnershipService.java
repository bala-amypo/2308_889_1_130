package com.example.demo.service;

import com.example.demo.model.DeviceOwnershipRecord;

import java.util.List;

public interface DeviceOwnershipService {

    DeviceOwnershipRecord register(DeviceOwnershipRecord device);

    List<DeviceOwnershipRecord> getAll();

    DeviceOwnershipRecord getBySerial(String serial);

    DeviceOwnershipRecord updateStatus(Long id, boolean active);

    void deleteById(Long id);
}
