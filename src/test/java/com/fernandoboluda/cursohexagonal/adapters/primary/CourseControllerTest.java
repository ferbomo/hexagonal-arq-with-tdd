package com.fernandoboluda.cursohexagonal.adapters.primary;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.fernandoboluda.cursohexagonal.CourseRequest;
import com.fernandoboluda.cursohexagonal.converters.CourseRequestToCourseConverter;
import com.fernandoboluda.cursohexagonal.domain.Course;
import com.fernandoboluda.cursohexagonal.ports.primary.CourseService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CourseControllerTest {

  @Mock
  public CourseService courseService;
  @Mock
  Course course;
  @Mock
  public CourseRequestToCourseConverter converter;
  @Mock
  CourseRequest courseRequest;

  @InjectMocks
  public CourseController sut;

  @Test
  void shouldGetAllCourses() {
    sut.getAllCourses();

    verify(courseService, times(1)).getAllCourses();
  }

  @Test
  void shouldSaveCourse() {
    sut.saveCourse(courseRequest);

    verify(courseService, times(1)).saveCourse(any());
  }

}