package problem2501;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int th = scanner.nextInt();
    int[] d = new int[num];
    int j = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        d[j++] = i;

      }
    }
    System.out.println(d[th - 1]);
    scanner.close();
  }
}
