// London P
// IT-CS-Lecture-11

import java.util.*;

public class Lecture11 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    //

    // SELF-CHECK PROBLEMS:
    // Put your answer for #2A here:
    // numbers[0]

    // Put your answer for #2B here:
    // numbers[9]

    // Put your answer for #2C here:
    // numbers[numbers.length - 1]

    // Put your answer for #3 here:
    int[] data = {27, 51, 33, -1, 101};


    // Put your answer for #5 here:
    // 0, 4, 11, 0, 44, 0, 0, 2

    // Put your answer for #11 here:
    int[] array = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
    average(array);

    // EXERCISES:
    // None for this lecture
  }
  public static double average(int[] array) {
    if (array == null || array.length == 0) {
      return 0.0; // Handle edge cases where the array is null or empty
    }

    double sum = 0;
    for (int num : array) {
      sum += num;
    }
    return sum / array.length;
  }

}
