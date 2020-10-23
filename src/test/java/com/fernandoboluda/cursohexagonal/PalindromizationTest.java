package com.fernandoboluda.cursohexagonal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromizationTest {

  @Test
  void Error_Cases() {

    assertEquals("Error!", Palindromization.palindromization("", 2));
    assertEquals("Error!", Palindromization.palindromization("123", 1));
  }

  @Test
  void Examples() {

    assertEquals("11", Palindromization.palindromization("123", 2));
    assertEquals("121", Palindromization.palindromization("123", 3));
    assertEquals("1221", Palindromization.palindromization("123", 4));
    assertEquals("12321", Palindromization.palindromization("123", 5));
    assertEquals("123321", Palindromization.palindromization("123", 6));
    assertEquals("1231321", Palindromization.palindromization("123", 7));
    assertEquals("12311321", Palindromization.palindromization("123", 8));
    assertEquals("123121321", Palindromization.palindromization("123", 9));
    assertEquals("1231221321", Palindromization.palindromization("123", 10));
  }

}
