package com.moraism.courses_api.controllers;

import com.moraism.courses_api.dto.CreateCourseRequestDTO;
import com.moraism.courses_api.model.Course;
import com.moraism.courses_api.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CoursesController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    private ResponseEntity<Object> create(@RequestBody CreateCourseRequestDTO createCourseRequestDTO) {

    }
}
