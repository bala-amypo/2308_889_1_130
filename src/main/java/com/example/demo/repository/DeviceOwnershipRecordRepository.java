package com.example.demo.repository;

import com.example.demo.model.DeviceOwnershipRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeviceOwnershipRecordRepository
        extends JpaRepository<DeviceOwnershipRecord, Long> {

    Optional<DeviceOwnershipRecord> findBySerialNumber(String serialNumber);

    boolean existsBySerialNumber(String serialNumber);
}
package com.example.demo.repository;

import com.example.demo.model.DeviceOwnershipRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface DeviceOwnershipRecordRepository extends JpaRepository<DeviceOwnershipRecord, Long> {
    Optional<DeviceOwnershipRecord> findBySerialNumber(String serialNumber);
    boolean existsBySerialNumber(String serialNumber);
}


FRAUDALERT:


package com.example.demo.repository;

import com.example.demo.model.FraudAlertRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FraudAlertRecordRepository extends JpaRepository<FraudAlertRecord, Long> {
    List<FraudAlertRecord> findByClaimId(Long claimId);
}