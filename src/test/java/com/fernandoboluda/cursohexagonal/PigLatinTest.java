package com.fernandoboluda.cursohexagonal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PigLatinTest {

  private PigLatin p;

  @BeforeEach
  void setUp() {
    p = new PigLatin();
  }

  @Test
  void testMap() {
    assertEquals("apmay", p.translate("map"));
  }

  @Test
  void testegg() {
    assertEquals("eggway", p.translate("egg"));
  }

  @Test
  void testspaghetti() {
    assertEquals("aghettispay", p.translate("spaghetti"));
  }

  @Test
  void testEs3t5tay() {
    assertNull(p.translate("es3t5tay"));
  }
}



