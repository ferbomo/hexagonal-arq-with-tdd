package com.fernandoboluda.cursohexagonal;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class Palindromization {

  private Palindromization() {
  }

  public static String palindromization(String elements, int n) {
    if (elements.isEmpty() || n < 2) {
      return "Error!";
    }
    StringBuilder sb = new StringBuilder();
    int counter = 0;
    sb.insert(sb.length() / 2, elements.charAt(counter));
    for (int i = 1; i < n; i++) {
      if (sb.length() % 2 == 0) {
        counter = (counter + 1) % elements.length();
        sb.insert(sb.length() / 2, elements.charAt(counter));
      } else {
        sb.insert(sb.length() / 2, elements.charAt(counter));
      }
    }
    return sb.toString();
  }

}
