import java.util.Scanner;
public class Six {
  public static void main(String[] args) {
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
}
