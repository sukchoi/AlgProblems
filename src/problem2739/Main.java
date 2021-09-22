package problem2739;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int mul = scanner.nextInt();
    for (int i = 1; i <= 9; i++) {
      System.out.println(mul + " * " + i + " = " + (mul * i));

    }
    scanner.close();
  }
}
