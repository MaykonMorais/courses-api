package com.moraism.courses_api.controllers;

import com.moraism.courses_api.controllers.mappers.CourseMapper;
import com.moraism.courses_api.dto.CourseResponseDTO;
import com.moraism.courses_api.dto.CreateCourseRequestDTO;
import com.moraism.courses_api.model.Course;
import com.moraism.courses_api.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseMapper courseMapper;

    @Autowired
    private CourseService courseService;

    @PostMapping
    private ResponseEntity<CourseResponseDTO> create(@RequestBody CreateCourseRequestDTO newCourse) {
        Course course = courseMapper.toEntity(newCourse);
        Course createdCourse = courseService.createCourse(course);

        var response = courseMapper.toDTO(createdCourse);

        return ResponseEntity.ok(response);
    }
}
