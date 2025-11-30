package com.moraism.courses_api.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.UUID;

@Entity
@Table(name = "module")
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String title;

    @Column(name = "order_index")
    private Integer orderIndex;

    @OneToMany(mappedBy = "module")
    private ArrayList<Lesson> lessons;
}
