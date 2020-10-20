package com.fernandoboluda.cursohexagonal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

 class SingleCharacterPalindromeTest {

  @Test
   void basicTests() {
    assertEquals("OK", SingleCharacterPalindrome.solve("abba"));
    assertEquals("remove one", SingleCharacterPalindrome.solve("abbaa"));
    assertEquals("not possible", SingleCharacterPalindrome.solve("abbaab"));
    assertEquals("remove one", SingleCharacterPalindrome.solve("madmam"));
    assertEquals("not possible", SingleCharacterPalindrome.solve("raydarm"));
    assertEquals("OK", SingleCharacterPalindrome.solve("hannah"));
  }
}
