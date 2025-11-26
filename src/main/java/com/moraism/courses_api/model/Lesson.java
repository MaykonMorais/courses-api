package com.moraism.courses_api.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Lesson {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;

    private String url;

    @Column(name = "duration")
    private Integer durationInMinutes;

    @ManyToOne()
    @JoinColumn(name = "module_id")
    private Module module;
}
