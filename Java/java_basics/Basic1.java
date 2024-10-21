// patterns can be seen as a matrix. where whitespace is 0 and characters are 1s

import java.util.Scanner;

public class Basic1 {
  static void First() {
    System.out.println("Hello\nSamar Khan");
  }

  static void Second() {
    System.out.println(74 + 36);
  }

  static void Third() {
    System.out.println(50 / 3);
  }

  static void Fourth() {
    System.out.println(-5 + 8 * 6);
    System.out.println((55 + 9) % 9);
    System.out.println(20 + -3 * 5 / 8);
    System.out.println(5 + 15 / 3 * 2 - 8 % 3);
  }

  static void Fifth() {
    System.out.print("Input First number: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.print("Input Second number: ");
    int b = sc.nextInt();
    System.out.println(a * b);
    sc.close();

  }

  static void Sixth() {
    System.out.print("Input First number: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.print("Input Second number: ");
    int b = sc.nextInt();
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);
    sc.close();
  }

  static void Seven() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input a number: ");
    int a = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(a * i);
    }
    sc.close();
  }

  static void Eight() {
    System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
  }

  static void Ninth() {
    System.out.println(
        4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
  }

  static void Tenth() {
    double r = 7.5;
    System.out.println("Perimeter is: " + Math.PI * r * 2);
    System.out.println("Area is: " + 3.14 * (r * r));

  }

  static void Eleven() {
    Scanner sc = new Scanner(System.in);
    System.out.print("number 1:");
    int a = sc.nextInt();
    System.out.print("number 2:");
    int b = sc.nextInt();
    System.out.print("number 3:");
    int c = sc.nextInt();
    sc.close();
    System.out.println("Average is : " + (a + b + c) / 3);
  }

  static void Twelve() {
    double w = 5.6;
    double h = 8.5;
    System.out.println("Area is: " + w * h);
    System.out.println("Perimeter is: " + (w + h) * 2);
  }

  static void Thirteen() {
    System.out.println(Integer.toBinaryString(0b10 + 0b11));
  }

  static void Fourteenth() {
    int num = 5;
    int baseo = 2;
    String quotient = "";
    while (num != 0) {
      quotient = quotient + Integer.toString(num % baseo);
      num = num / baseo;
    }
    System.out.println(quotient);
  }

  public static void main(String[] args) {
    Fourteenth();
  }
}
