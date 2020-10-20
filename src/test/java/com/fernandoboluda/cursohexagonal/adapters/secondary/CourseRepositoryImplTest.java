package com.fernandoboluda.cursohexagonal.adapters.secondary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fernandoboluda.cursohexagonal.domain.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class CourseRepositoryImplTest {

  private final CourseRepositoryImpl courseRepository = new CourseRepositoryImpl();

  @BeforeEach
  public void setup() {
    courseRepository.addCourse(new Course("Course 1", 60));
    courseRepository.addCourse(new Course("Course 2", 40));
    courseRepository.addCourse(new Course("Course 3", 20));
  }

  @Test
  void shouldObtainData() {
    List<Course> courses = courseRepository.findAllCourses();

    assertEquals("Course 1", courses.get(0).getTitle());
    assertEquals("Course 2", courses.get(1).getTitle());
    assertEquals("Course 3", courses.get(2).getTitle());
  }

  @Test
  void shouldSaveData() {
    Course course = new Course("Course 1", 30);
    Course courseSaved = courseRepository.save(course);

    assertEquals("Course 1", courseSaved.getTitle());
  }

}