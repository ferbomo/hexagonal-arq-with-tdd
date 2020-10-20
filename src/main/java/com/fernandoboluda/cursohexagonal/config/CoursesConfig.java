package com.fernandoboluda.cursohexagonal.config;

import com.fernandoboluda.cursohexagonal.adapters.secondary.CourseRepositoryImpl;
import com.fernandoboluda.cursohexagonal.ports.secondary.CourseRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoursesConfig {

  @Bean
  public CourseRepository courseRepository() {
    return new CourseRepositoryImpl();
  }

}
