package com.fernandoboluda.cursohexagonal.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Course {

  private String title;
  private Integer duration;
}
