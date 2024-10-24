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

  static void largest() {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int max = a;
    if (b > max) {
      max = b;
    }
    if (c > max) {
      max = c;
    }
    System.out.println(max);
    sc.close();
  }

  static void alphabet() {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if (ch >= 'a' && ch <= 'z') {
      System.out.println("is lowercase");
    } else if (ch >= 'A' && ch <= 'Z') {
      System.out.println("is uppercase");
    } else {
      System.out.println("error");
    }
    sc.close();
  }

  static void fibo() {
    int a = 0;
    int b = 1;
    Scanner sc = new Scanner(System.in);
    System.out.print("enter position: ");
    int pos = sc.nextInt();
    int count = 2;
    while (count <= pos) {
      int temp = b;
      b = a + b;
      a = temp;
      count++;
    }
    System.out.print(b);
    sc.close();
  }

  static void occurences() {
    Scanner sc = new Scanner(System.in);
    int num = 1385757879;
    int find = sc.nextInt();
    int count = 0;
    while (num != 0) {
      int temp = num;
      temp = num % 10;
      if (temp == find) {
        count++;
      }
      num = num / 10;
    }
    System.out.println(count);
    sc.close();
  }

  static void reverseNumber() {
    int num = 23597;
    int result = 0;
    while (num != 0) {
      int temp = num;
      temp = num % 10;
      result = result * 10 + temp;
      num = num / 10;
    }
    System.out.println(result);
  }

  static void evenOrOdd() {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter num: ");
    int num = sc.nextInt();
    if (num % 2 == 0) {
      System.out.println("Is even");
    } else {
      System.out.println("is odd");
    }
    sc.close();
  }

  static void isPalindrome() {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    String temp = "";
    for (int i = input.length() - 1; i >= 0; i--) {
      temp = temp + input.charAt(i);
    }
    if (input.equals(temp)) {
      System.out.println("is palindrome");
    } else {
      System.out.println("is not palindrome");
    }
    System.out.println(temp);
    sc.close();
  }

  static void isArmstrong() {
    // Scanner sc = new Scanner(System.in);
    // sc.close();
  }

  static void difference() {
    // link :
    // https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

    int num = 4421;
    int product = 1;
    int sum = 0;
    while (num != 0) {
      int temp = num;
      temp = num % 10;
      product = temp * product;
      sum = sum + temp;
      num = num / 10;
    }
    System.out.println(product - sum);

  }

  static void factors() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        System.out.println(i);
      }
    }
    sc.close();
  }

  static void largestcont() {
    Scanner sc = new Scanner(System.in);
    int num;
    int max = 0;
    do {
      System.out.print("enter number: ");
      num = sc.nextInt();
      if (num > max) {
        max = num;
      }

    } while (num != 0);
    System.out.println(max);
    sc.close();
  }

  static void sum() {
    Scanner sc = new Scanner(System.in);
    int num;
    int sum = 0;
    do {
      System.out.print("Enter Number: ");
      num = sc.nextInt();
      sum = sum + num;
    } while (num != 0);
    sc.close();
    System.out.println(sum);
  }

  // Intermediate java programs.

  static void factorial() {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number: ");
    int num = sc.nextInt();
    int result = 1;
    while (num >= 1) {
      result = result * num;
      num = num - 1;
    }
    sc.close();
    System.out.println(result);
  }

  static void calculateAverage() {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the no. of digits you want to calculate: ");
    int count = sc.nextInt();
    int sum = 0;
    for (int i = 0; i < count; i++) {
      System.out.print("enter number: ");
      sum = sum + sc.nextInt();
    }
    System.out.println(sum / count);
    sc.close();
  }

  static void countEvenDays() {
    int totalDays = 31;
    int countOfEvenDays = 0;
    for (int i = 1; i <= totalDays; i++) {
      if (i % 2 == 0) {
        countOfEvenDays++;
      }
    }
    System.out.println("Kunal will be able to go out for a total of " + countOfEvenDays + " days");
  }

  static void complexSum() {
    Scanner sc = new Scanner(System.in);
    int nums;
    int sumOfNegatives = 0;
    int sumOfeven = 0;
    int sumOfOdd = 0;

    do {

      System.out.print("Enter number: ");
      nums = sc.nextInt();

      if (nums < 0) {
        sumOfNegatives = sumOfNegatives + nums;
      }
      if (nums % 2 == 0 && nums > 0) {
        sumOfeven = sumOfeven + nums;
      }
      if (nums % 2 != 0 && nums > 0) {
        sumOfOdd = sumOfOdd + nums;
      }

    } while (nums != 0);
    sc.close();
    System.out.println("Sum of all negative numbers: " + sumOfNegatives);
    System.out.println("Sum of all positive even numbers: " + sumOfeven);
    System.out.println("Sum of all positive odd numbers: " + sumOfOdd);
  }
  public static void main(String... args) {
  }
}
