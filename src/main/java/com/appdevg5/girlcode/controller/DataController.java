package com.appdevg5.girlcode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdevg5.girlcode.entity.DataEntity;
import com.appdevg5.girlcode.service.DataService;

@RestController
@RequestMapping("/api/data")
@CrossOrigin(origins = "*")
public class DataController {

    @Autowired
    DataService dataService;

    // CREATE
    @PostMapping
    public DataEntity postData(@RequestBody DataEntity data) {
        return dataService.postData(data);
    }

    // READ
    @GetMapping
    public List<DataEntity> getAllData() {
        return dataService.getAllData();
    }

    // UPDATE
    @PutMapping("/{id}")
    public DataEntity updateData(@PathVariable Long id, @RequestBody DataEntity newData) {
        return dataService.updateData(id, newData);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteData(@PathVariable Long id) {
        return dataService.deleteData(id);
    }
}
