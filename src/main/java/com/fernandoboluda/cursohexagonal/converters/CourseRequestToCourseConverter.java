package com.fernandoboluda.cursohexagonal.converters;

import com.fernandoboluda.cursohexagonal.CourseRequest;
import com.fernandoboluda.cursohexagonal.domain.Course;
import org.mapstruct.Mapper;

@Mapper
public interface CourseRequestToCourseConverter {

  Course convertCourseRequest(CourseRequest request);
}
