package com.moraism.courses_api.controllers;

import com.moraism.courses_api.dto.CreateCourseRequestDTO;
import com.moraism.courses_api.dto.CreatedCourseResponseDTO;
import com.moraism.courses_api.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    private ResponseEntity<CreatedCourseResponseDTO> create(@RequestBody CreateCourseRequestDTO newCourse) {
        CreatedCourseResponseDTO course = courseService.createCourse(newCourse);

        return ResponseEntity.status(HttpStatus.CREATED).body(course);
    }
}
