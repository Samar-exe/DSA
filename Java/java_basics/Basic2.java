// Kunal kushwaha problems.

import java.util.Scanner;

public class Basic2 {

  static int Flow() {
    int year = 2024;
    if (year % 4 == 0) {
      return 1;
    }
    return 0;
  }

  static int CommonFactors() {
    int num1 = 6;
    int num2 = 18;
    int result1 = 0;
    int result2 = 0;
    for (int i = 1; i <= num1; i++) {
      if (num1 % i == 0) {
        if (i > result1) {
          result1 = i;
        }
      }
    }
    for (int i = 1; i <= num2; i++) {
      if (num2 % i == 0) {
        if (i > result2) {
          result2 = i;
        }
      }
    }
    if (result1 < result2) {
      return result1;
    }
    return result2;
  }


  public static void main(String... args) {
  }
}
