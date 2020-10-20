package com.fernandoboluda.cursohexagonal;

public class CourseRequest {

  public CourseRequest(String title, Integer duration) {
    this.title = title;
    this.duration = duration;
  }

  private String title;
  private Integer duration;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }
}
