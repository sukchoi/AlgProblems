package problem1085;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int w = scanner.nextInt();
    int h = scanner.nextInt();
    // x, y, w-x, h-y
    System.out.println((compare(compare(x, y), compare(w - x, h - y))));

    scanner.close();
  }

  public static int compare(int a, int b) {
    return a > b ? b : a;
  }
}
