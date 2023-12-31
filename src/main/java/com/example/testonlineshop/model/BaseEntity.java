package com.example.testonlineshop.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.java.Log;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class BaseEntity {

    private LocalDateTime createionDate;
    private LocalDateTime lastModifiedDate;

    @PrePersist
    public void onPrePersist() {
        this.setCreateionDate(LocalDateTime.now());
        this.setCreateionDate(LocalDateTime.now());
    }

    @PreUpdate
    public void onPreUpdate() {
        this.setLastModifiedDate(LocalDateTime.now());
    }

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
