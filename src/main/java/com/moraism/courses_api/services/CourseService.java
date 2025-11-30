package com.moraism.courses_api.services;

import com.moraism.courses_api.dto.CourseResponseDTO;
import com.moraism.courses_api.dto.CreateCourseRequestDTO;
import com.moraism.courses_api.model.Course;
import com.moraism.courses_api.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public void createCourse(CreateCourseRequestDTO courseRequestDTO) {
//        Course course = new Course();
//        course.setTitle(courseRequestDTO.title());
//        course.

    }
}
