package com.moraism.courses_api.controllers;

import com.moraism.courses_api.dto.CreateCourseRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CoursesController {

    // chamada para um service
    @PostMapping
    private void create(@RequestBody CreateCourseRequestDTO createCourseRequestDTO) {

    }
}
