package com.example.demo.service.impl;

import com.example.demo.model.DeviceOwnershipRecord;
import com.example.demo.repository.DeviceOwnershipRecordRepository;
import com.example.demo.service.DeviceOwnershipService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceOwnershipServiceImpl implements DeviceOwnershipService {

    private final DeviceOwnershipRecordRepository repository;

    public DeviceOwnershipServiceImpl(DeviceOwnershipRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public DeviceOwnershipRecord register(DeviceOwnershipRecord device) {
        return repository.save(device);
    }

    @Override
    public List<DeviceOwnershipRecord> getAll() {
        return repository.findAll();
    }

    @Override
    public DeviceOwnershipRecord getBySerial(String serial) {
        return repository.findBySerialNumber(serial)
                .orElseThrow(() -> new RuntimeException("Device not found with serial: " + serial));
    }

    @Override
    public DeviceOwnershipRecord updateStatus(Long id, boolean active) {
        DeviceOwnershipRecord device = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Device not found with id: " + id));

        device.setActive(active);
        return repository.save(device);
    }

    @Override
    public void deleteById(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Device not found with id: " + id);
        }
        repository.deleteById(id);
    }
}
