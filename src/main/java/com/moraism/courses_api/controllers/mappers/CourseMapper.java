package com.moraism.courses_api.controllers.mappers;

import com.moraism.courses_api.dto.CourseResponseDTO;
import com.moraism.courses_api.dto.CreateCourseRequestDTO;
import com.moraism.courses_api.model.Course;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseMapper {
    Course toEntity(CreateCourseRequestDTO createCourseRequestDTO);
    CourseResponseDTO toDTO(Course course);
}
