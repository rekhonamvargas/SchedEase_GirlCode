package com.appdevg5.girlcode.service;

import com.appdevg5.girlcode.entity.SubjectListEntity;
import com.appdevg5.girlcode.repository.SubjectListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectListService {

    @Autowired
    private SubjectListRepository subjectListRepository;

    public List<SubjectListEntity> getAllSubjectLists() {
        return subjectListRepository.findAll();
    }

    public Optional<SubjectListEntity> getSubjectListById(Long id) {
        return subjectListRepository.findById(id);
    }

    public SubjectListEntity createSubjectList(SubjectListEntity subjectList) {
        return subjectListRepository.save(subjectList);
    }

    public SubjectListEntity updateSubjectList(Long id, SubjectListEntity updatedSubjectList) {
        return subjectListRepository.findById(id).map(subjectList -> {
            subjectList.setDataId(updatedSubjectList.getDataId());
            subjectList.setFilterId(updatedSubjectList.getFilterId());
            subjectList.setDisplayOrder(updatedSubjectList.getDisplayOrder());
            subjectList.setIsSelected(updatedSubjectList.getIsSelected());
            return subjectListRepository.save(subjectList);
        }).orElse(null);
    }

    public void deleteSubjectList(Long id) {
        subjectListRepository.deleteById(id);
    }
}
