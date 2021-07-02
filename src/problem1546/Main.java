package problem1546;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numOfScores = scanner.nextInt();
    int[] original = new int[numOfScores];
    for (int i = 0; i < numOfScores; i++) {
      original[i] = scanner.nextInt();
    }

    // 1. find max
    int max = 0;
    for (int i : original) {
      max = Math.max(max, i);
    }

    // 2. calculate forged scores
    double sum = 0;
    for (int i = 0; i < numOfScores; i++) {
      sum += 100.0 * original[i] / max;
    }
    // 3. find average
    System.out.println(sum / numOfScores);
    scanner.close();
  }
}
