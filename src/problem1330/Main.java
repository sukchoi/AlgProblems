package problem1330;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int valueA = scanner.nextInt();
    int valueB = scanner.nextInt();

    if (valueA > valueB) {
      System.out.println(">");
    } else if (valueA < valueB) {
      System.out.println("<");
    } else {
      System.out.println("==");
    }
    scanner.close();
  }

}
