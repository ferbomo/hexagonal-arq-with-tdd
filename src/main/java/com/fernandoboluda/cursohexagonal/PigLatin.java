package com.fernandoboluda.cursohexagonal;

public class PigLatin {

  public static final String VOWELS = "aAeEiIoOuU";

  public String translate(String text) {
    if(text.matches(".*\\d.*")){
      return null;
    }
    if (text.matches("([" + VOWELS + "]).*")) {
      return text + "way".toLowerCase();
    } else {
      StringBuilder sb = new StringBuilder(text);
      for (int i = 0; i < text.length() - 1 && !isAVowel(text.charAt(i)); i++) {
        sb.insert(text.length(), text.charAt(i));
        sb.deleteCharAt(0);
      }
      return sb.toString().toLowerCase()+"ay";
    }
  }

  private boolean isAVowel(char character) {
    return VOWELS.indexOf(character) >= 0;
  }
}
