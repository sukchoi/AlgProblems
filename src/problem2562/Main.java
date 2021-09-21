package problem2562;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int maxVal = 0, maxIndex = 0;
    for (int i = 0; i < 9; i++) {
      int temp = scanner.nextInt();
      if (temp > maxVal) {
        maxVal = temp;
        maxIndex = i;
      }

    }
    System.out.println(maxVal + "\n" + (maxIndex + 1));
    scanner.close();
  }

}
