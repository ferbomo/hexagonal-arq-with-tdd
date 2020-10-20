package com.fernandoboluda.cursohexagonal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConvertToCamelCaseTest {

  @Test
  void testSomeUnderscoreLowerStart() {
    String input = "the_Stealth_Warrior";
    System.out.println("input: " + input);
    assertEquals("theStealthWarrior", ConvertToCamelCase.toCamelCase(input));
  }

  @Test
  void testSomeDashLowerStart() {
    String input = "the-Stealth-Warrior";
    System.out.println("input: " + input);
    assertEquals("theStealthWarrior", ConvertToCamelCase.toCamelCase(input));
  }

}
