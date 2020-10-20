package com.fernandoboluda.cursohexagonal.converters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fernandoboluda.cursohexagonal.CourseRequest;
import com.fernandoboluda.cursohexagonal.domain.Course;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

class CourseRequestToCourseConverterTest {

  Course courseExpected = new Course("Course 1",30);
  CourseRequest courseRequest = new CourseRequest("Course 1", 30);
  CourseRequestToCourseConverter courseConverter = Mappers.getMapper(CourseRequestToCourseConverter.class);

  @Test
  void shouldConvertRequestToDomain() {
      Course result = courseConverter.convertCourseRequest(courseRequest);
      assertEquals(courseExpected, result);
  }

}