package com.moraism.courses_api.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.UUID;

@Entity
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String title;

    private Number order;

    @OneToMany(mappedBy = "module")
    private ArrayList<Lesson> lessons;
}
