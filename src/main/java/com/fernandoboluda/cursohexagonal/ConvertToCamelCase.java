package com.fernandoboluda.cursohexagonal;

public class ConvertToCamelCase {

  private ConvertToCamelCase() {
  }

  public static String toCamelCase(String text) {
    StringBuilder sb = new StringBuilder(text);
    int deletions = 0;
    for (int i = 0; i < text.length() - 1; i++) {
      if (text.charAt(i) == '-' || text.charAt(i) == '_') {
        sb.deleteCharAt(i-deletions);
        sb.replace(i-deletions,i+1-deletions, String.valueOf(text.charAt(i + 1)).toUpperCase());
        deletions++;
      }
    }
    return sb.toString();
  }
}
