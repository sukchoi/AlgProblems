package problem2609;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    // find gcd lcm

    int gcd = (x > y ? gcd(x, y) : gcd(y, x));
    int lcm = x * y / gcd;
    System.out.println(gcd);
    System.out.println(lcm);
    scanner.close();
  }

  public static int gcd(int x, int y) {
    while (y > 0) {
      int tmp = x;
      x = y;
      y = tmp % y;

    }
    return x;
  }

}
