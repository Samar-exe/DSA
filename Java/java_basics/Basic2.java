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

  public static void main(String... args) {
  }
}
