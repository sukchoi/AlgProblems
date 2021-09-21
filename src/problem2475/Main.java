package problem2475;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int NUM = 5;
    int[] values = new int[NUM];
    int sum = 0;
    for (int i = 0; i < NUM; i++) {
      values[i] = scanner.nextInt();
      sum += values[i] * values[i];
    }
    System.out.println(sum % 10);
    scanner.close();
  }
}
