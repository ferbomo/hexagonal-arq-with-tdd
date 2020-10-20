package com.fernandoboluda.cursohexagonal.adapters.secondary;

import com.fernandoboluda.cursohexagonal.domain.Course;
import com.fernandoboluda.cursohexagonal.ports.secondary.CourseRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseRepositoryImpl implements CourseRepository {

  private final List<Course> courses = new ArrayList<>();

  @Override
  public List<Course> findAllCourses() {
    return courses;
  }

  @Override
  public Course save(Course course) {
    courses.add(course);
    return course;
  }

  public void addCourse(Course course) {
    courses.add(course);
  }
}
