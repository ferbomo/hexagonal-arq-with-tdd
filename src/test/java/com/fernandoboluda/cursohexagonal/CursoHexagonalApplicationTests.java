package com.fernandoboluda.cursohexagonal;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fernandoboluda.cursohexagonal.adapters.primary.CourseController;
import com.fernandoboluda.cursohexagonal.adapters.secondary.CourseRepositoryImpl;
import com.fernandoboluda.cursohexagonal.domain.Course;
import com.fernandoboluda.cursohexagonal.ports.primary.CourseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = CursoHexagonalApplication.class)
@AutoConfigureMockMvc
class CursoHexagonalApplicationTests {

  @Autowired
  public MockMvc mockMvc;

  CourseRepositoryImpl courseRepository = new CourseRepositoryImpl();

  @BeforeEach
  public void setup(){
  }

  @Test
  void contextLoads() {
  }

  @Test
  void shouldGetAllCourses() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/courses")
        .contentType(MediaType.APPLICATION_JSON)
        .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andReturn();
  }

}
