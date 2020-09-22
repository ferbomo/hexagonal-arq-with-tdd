package com.fernandoboluda.cursohexagonal.ports.secondary;

import com.fernandoboluda.cursohexagonal.domain.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository {

  List<Course> findAllCourses();

  Course save(Course course);
}
