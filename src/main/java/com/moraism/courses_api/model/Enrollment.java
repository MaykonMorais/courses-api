package com.moraism.courses_api.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private Account student;

    @ManyToOne()
    @JoinColumn(name = "course_id")
    private Course course;

    @CreationTimestamp()
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp()
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
