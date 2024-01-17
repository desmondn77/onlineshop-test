package com.example.testonlineshop.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
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
    //@Column(updatable = false)
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
