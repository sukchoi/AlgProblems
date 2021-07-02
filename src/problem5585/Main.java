package problem5585;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int money = 1000-scanner.nextInt();
    int[] values = {500, 100, 50, 10, 5, 1};
    int coins = 0;
    for (int i : values) {
      if (money >= i) {
        coins += money / i;
        money %= i;
      }
    }
    scanner.close();
    System.out.println(coins);
  }

}
