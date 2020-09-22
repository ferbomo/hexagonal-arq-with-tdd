package com.fernandoboluda.cursohexagonal.adapters.primary;


import com.fernandoboluda.cursohexagonal.CourseRequest;
import com.fernandoboluda.cursohexagonal.converters.CourseRequestToCourseConverter;
import com.fernandoboluda.cursohexagonal.domain.Course;
import com.fernandoboluda.cursohexagonal.ports.primary.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/courses")
public class CourseController {

  private final CourseService courseService;

  private final CourseRequestToCourseConverter converter;

  @GetMapping
  public List<Course> getAllCourses() {
    return courseService.getAllCourses();
  }

  @PostMapping
  public ResponseEntity<Course> saveCourse(@RequestParam CourseRequest request) {
    Course courseConverted = converter.convertToCourse(request);
    return courseService.saveCourse(courseConverted);
  }
}
