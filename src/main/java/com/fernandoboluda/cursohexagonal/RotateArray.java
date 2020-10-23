package com.fernandoboluda.cursohexagonal;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class RotateArray {

  private RotateArray() {
  }

  public static int[] solution(int[] array, int numberOfRotations) {
    List<Integer> numbers = Arrays.stream(array)
        .boxed()
        .collect(toList());
    if (numbers.isEmpty() || numberOfRotations == 0) {
      return array;
    }
    for (int i = 0; i < numberOfRotations; i++) {
      rotate(numbers);
    }
    return numbers.stream()
        .mapToInt(number -> number)
        .toArray();
  }

  private static void rotate(List<Integer> numbers) {
    numbers.add(0, numbers.get(numbers.size() - 1));
    numbers.remove(numbers.size() - 1);
  }

}
