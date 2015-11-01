package com.example.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TestRecord {

    @Id
    @GeneratedValue(generator = "test-uuidgen")
    @Column(columnDefinition = "uuid")
    private UUID id;

    private String notes;
}
