package com.moraism.courses_api.services;

import com.moraism.courses_api.dto.CourseResponseDTO;
import com.moraism.courses_api.model.Course;
import com.moraism.courses_api.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public CourseResponseDTO createCourse(Course newCourse) {
        var course  = courseRepository.save(newCourse);

        return CourseResponseDTO.builder()
                .id(course.getId())
                .name(course.getName())
                .category(course.getCategory())
                .build();
    }
}
