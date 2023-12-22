package com.example.testonlineshop.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
//define triggers

@MappedSuperclass
public class BaseEntity {
    private LocalDateTime createionDate;
    private LocalDateTime lastModifiedDate;

    @CreationTimestamp
    @Column(updatable = false)
    public LocalDateTime getCreateionDate() {
        return createionDate;
    }

    public void setCreateionDate(LocalDateTime createionDate) {
        this.createionDate = createionDate;
    }

    @UpdateTimestamp
    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
