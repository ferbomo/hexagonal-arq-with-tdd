package com.fernandoboluda.cursohexagonal.ports.primary;

import com.fernandoboluda.cursohexagonal.domain.Course;
import com.fernandoboluda.cursohexagonal.ports.secondary.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CourseService {

  private final CourseRepository courseRepository;

  public List<Course> getAllCourses() {
    return courseRepository.findAllCourses();
  }

  public ResponseEntity<Course> saveCourse(Course course) {
    if (course.getDuration() < 10) {
      return ResponseEntity.of(Optional.empty());
    } else {
      return ResponseEntity.of(Optional.of(courseRepository.save(course)));
    }
  }
}
