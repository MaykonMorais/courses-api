package com.moraism.courses_api.services;

import com.moraism.courses_api.model.Course;
import com.moraism.courses_api.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course createCourse(Course course) {
        course.setActive(true);
        course.setLevel("EXPERT");

        return courseRepository.save(course);
    }
}
