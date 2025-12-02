package com.appdevg5.girlcode.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "SubjectList")
public class SubjectListEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjectlistId;

    private Long dataId;
    private Long filterId;
    private Integer displayOrder;
    private Boolean isSelected;

    // Getters and Setters
    public Long getSubjectlistId() {
        return subjectlistId;
    }
    public void setSubjectlistId(Long subjectlistId) {
        this.subjectlistId = subjectlistId;
    }
    public Long getDataId() {
        return dataId;
    }
    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }
    public Long getFilterId() {
        return filterId;
    }
    public void setFilterId(Long filterId) {
        this.filterId = filterId;
    }
    public Integer getDisplayOrder() {
        return displayOrder;
    }
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }
    public Boolean getIsSelected() {
        return isSelected;
    }
    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }
}
