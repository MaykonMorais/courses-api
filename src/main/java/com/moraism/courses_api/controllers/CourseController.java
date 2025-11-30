package com.moraism.courses_api.controllers;

import com.moraism.courses_api.dto.CourseResponseDTO;
import com.moraism.courses_api.dto.CreateCourseRequestDTO;
import com.moraism.courses_api.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    private void create(@RequestBody CreateCourseRequestDTO course) {
//        CourseResponseDTO course = courseService.createCourse(newCourse);
//        return ResponseEntity.status(HttpStatus.CREATED).body(course);
    }
}
