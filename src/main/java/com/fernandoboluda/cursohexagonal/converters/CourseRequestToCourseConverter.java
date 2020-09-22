package com.fernandoboluda.cursohexagonal.converters;

import com.fernandoboluda.cursohexagonal.CourseRequest;
import com.fernandoboluda.cursohexagonal.domain.Course;
import org.springframework.stereotype.Service;

@Service
public class CourseRequestToCourseConverter {

  public Course convertToCourse(CourseRequest request) {
    return Course.builder()
        .title(request.getTitle())
        .duration(request.getDuration())
        .build();
  }
}
