package com.fernandoboluda.cursohexagonal.adapters.primary;


import com.fernandoboluda.cursohexagonal.CourseRequest;
import com.fernandoboluda.cursohexagonal.converters.CourseRequestToCourseConverter;
import com.fernandoboluda.cursohexagonal.domain.Course;
import com.fernandoboluda.cursohexagonal.ports.primary.CourseService;
import org.mapstruct.factory.Mappers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

  public CourseController(CourseService courseService) {
    this.courseService = courseService;
  }

  private final CourseService courseService;

  private final CourseRequestToCourseConverter converter = Mappers
      .getMapper(CourseRequestToCourseConverter.class);

  @GetMapping
  public List<Course> getAllCourses() {
    return courseService.getAllCourses();
  }

  @PostMapping
  public ResponseEntity<Course> saveCourse(@RequestParam CourseRequest request) {
    Course courseConverted = converter.convertCourseRequest(request);
    return courseService.saveCourse(courseConverted);
  }
}
