package com.moraism.courses_api.services;

import com.moraism.courses_api.dto.CreateCourseRequestDTO;
import com.moraism.courses_api.dto.CreatedCourseResponseDTO;
import com.moraism.courses_api.model.Course;
import com.moraism.courses_api.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public CreatedCourseResponseDTO createCourse(CreateCourseRequestDTO courseRequestDTO) {
        Course course = new Course();
        course.setTitle(courseRequestDTO.title());
        course.setDescription(courseRequestDTO.title());
        course.setActive(true);
        course.setLevel("EXPERT");

        Course courseCreated = courseRepository.save(course);

        return new CreatedCourseResponseDTO(courseCreated.getId(), courseCreated.getTitle(), courseCreated.getDescription());
    }
}
