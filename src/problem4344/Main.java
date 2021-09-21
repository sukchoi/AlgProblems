package problem4344;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int testCase = scanner.nextInt();

    for (int i = 0; i < testCase; i++) {

      int numOfS = scanner.nextInt();
      int[] scores = new int[numOfS];
      int sumScore = 0;
      double avgScore = 0.0;
      for (int j = 0; j < numOfS; j++) {
        scores[j] = scanner.nextInt();
        sumScore += scores[j];
      }
      avgScore = (double) sumScore / numOfS;
      int count = 0;
      for (int j : scores) {
        if (j > avgScore)
          count++;
      }
      System.out.printf("%.3f%%", (double) count / numOfS * 100);
    }
    scanner.close();
  }
}
