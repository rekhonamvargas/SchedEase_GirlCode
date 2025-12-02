package com.appdevg5.girlcode.controller;

import com.appdevg5.girlcode.entity.SubjectListEntity;
import com.appdevg5.girlcode.service.SubjectListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subjectlists")
@CrossOrigin(origins = "*")
public class SubjectListController {

    @Autowired
    private SubjectListService subjectListService;

    @GetMapping
    public List<SubjectListEntity> getAllSubjectLists() {
        return subjectListService.getAllSubjectLists();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubjectListEntity> getSubjectListById(@PathVariable Long id) {
        return subjectListService.getSubjectListById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public SubjectListEntity createSubjectList(@RequestBody SubjectListEntity subjectList) {
        return subjectListService.createSubjectList(subjectList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SubjectListEntity> updateSubjectList(@PathVariable Long id, @RequestBody SubjectListEntity updatedSubjectList) {
        SubjectListEntity subjectList = subjectListService.updateSubjectList(id, updatedSubjectList);
        return (subjectList != null) ? ResponseEntity.ok(subjectList) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSubjectList(@PathVariable Long id) {
        subjectListService.deleteSubjectList(id);
        return ResponseEntity.noContent().build();
    }
}
