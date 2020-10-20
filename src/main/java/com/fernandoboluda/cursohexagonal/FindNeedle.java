package com.fernandoboluda.cursohexagonal;

import java.util.Arrays;

public class FindNeedle {

  private FindNeedle() {
  }

  public static String findNeedle(Object[] haystack) {
    //for (int i = 0; i < haystack.length; i++) {
//      if (haystack[i] != null && haystack[i].equals("needle")) {
//        return "found the needle at position " + i;
//      }
//    }
//    return "no luck";
    return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
  }
}
