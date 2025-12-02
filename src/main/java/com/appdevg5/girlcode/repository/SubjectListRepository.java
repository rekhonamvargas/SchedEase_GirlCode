package com.appdevg5.girlcode.repository;

import com.appdevg5.girlcode.entity.SubjectListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectListRepository extends JpaRepository<SubjectListEntity, Long> {
}
