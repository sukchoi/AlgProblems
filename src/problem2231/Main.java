package problem2231;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    // 216 = 198 + 1 + 9 + 8
    Scanner sc = new Scanner(System.in);
    int val = sc.nextInt();
    int MAX = 1000000;
    int result = 0;

    for (int i = 0; i < MAX; i++) {
      int sum = 0;
      int num = i;
      while (num != 0) {
        sum += num % 10;
        num /= 10;
      }

      if (sum + i == val) {
        result = i;
        break;
      }
    }
    System.out.println(result);
  }
}
