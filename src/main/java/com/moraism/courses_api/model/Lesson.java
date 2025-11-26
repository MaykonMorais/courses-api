package com.moraism.courses_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Lesson {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;

    private String url;

    @Column(name = "duration")
    private Number durationInMinutes;
}
