package com.example.domain;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRecordRepository extends JpaRepository<TestRecord, UUID> {

}
