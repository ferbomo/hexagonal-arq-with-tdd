package com.fernandoboluda.cursohexagonal;

public class SingleCharacterPalindrome {

  private SingleCharacterPalindrome() {
  }

  public static String solve(String text) {
    if (isAPalindrome(text)) {
      return "OK";
    }
    for (int i=0; i<text.length();i++){
      String test = new StringBuilder(text).deleteCharAt(i).toString();
      if(isAPalindrome(test)){
        return "remove one";
      }
    }
    return "not possible";
  }

  private static boolean isAPalindrome(String text) {
    for (int i = 0, j = text.length()-1; i<j; i++, j--) {
      if (text.charAt(i) != text.charAt(j)) {
        return false;
      }
    }
    return true;
  }

  private static boolean isPalindrome2(String s) {
    return s.equals(new StringBuilder(s).reverse().toString());
  }
}
