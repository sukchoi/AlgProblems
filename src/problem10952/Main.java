package problem10952;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean proceed = true;
    while (proceed) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (a == 0 && b == 0)
        break;
      else
        System.out.println(a + b);
    }
    sc.close();
  }
}
