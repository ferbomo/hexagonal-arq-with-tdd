package com.fernandoboluda.cursohexagonal.ports.primary;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.fernandoboluda.cursohexagonal.domain.Course;
import com.fernandoboluda.cursohexagonal.ports.secondary.CourseRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CourseServiceTest {

  @Mock
  private CourseRepository courseRepository;
  @Mock
  Course course;
  @InjectMocks
  private CourseService courseService;

  @Test
  void shouldGetAllCourses() {
    courseService.getAllCourses();

    verify(courseRepository, times(1)).findAllCourses();
  }

  @Test
  void shouldSaveCourse() {
    when(course.getDuration()).thenReturn(30);
    when(courseRepository.save(course)).thenReturn(course);
    courseService.saveCourse(course);

    verify(courseRepository, times(1)).save(course);
  }

}