package com.appdevg5.girlcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appdevg5.girlcode.entity.DataEntity;

@Repository
public interface DataRepository extends JpaRepository<DataEntity, Long> {
}
