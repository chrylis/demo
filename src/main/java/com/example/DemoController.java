package com.example;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.TestRecord;
import com.example.domain.TestRecordRepository;

import lombok.RequiredArgsConstructor;

@RestController
@Transactional
@RequiredArgsConstructor(onConstructor=@__(@Autowired))
public class DemoController {

    protected final TestRecordRepository testRecords;
    
    @RequestMapping("/uuid/{id}")
    public Object byUuid(@PathVariable TestRecord id) {
        return id;
    }
    
    @RequestMapping("/uuidCreate")
    public Object createUuid(@RequestParam String notes) {
        TestRecord record = new TestRecord();
        record.setNotes(notes);
        return testRecords.save(record);
    }
}
