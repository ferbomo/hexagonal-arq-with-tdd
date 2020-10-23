package com.fernandoboluda.cursohexagonal;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class RotateArrayTest {

  @Test
  void testArrays() {
    int[] A = {3, 8, 9, 7, 6};
    int[] expected = {9, 7, 6, 3, 8};
    int K = 3;
    int[] result = RotateArray.solution(A, K);

    assertArrayEquals(expected, result);
  }

  @Test
  void testArrays2() {
    int[] A = {};
    int[] expected = {};
    int K = 3;
    int[] result = RotateArray.solution(A, K);

    assertArrayEquals(expected, result);
  }

  @Test
  void testArrays3() {
    int[] A = {3, 8, 9, 7, 6};
    int[] expected = {3, 8, 9, 7, 6};
    int K = 0;
    int[] result = RotateArray.solution(A, K);

    assertArrayEquals(expected, result);
  }

}