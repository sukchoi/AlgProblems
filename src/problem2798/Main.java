package problem2798;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numCard = scanner.nextInt();
    int blackJack = scanner.nextInt();
    int[] cards = new int[numCard];
    for (int i = 0; i < numCard; i++) {
      cards[i] = scanner.nextInt();
    }
    int result = blackJack;
    for (int i = 0; i < numCard - 2; i++) {
      for (int j = i + 1; j < numCard - 1; j++) {
        for (int k = j + 1; k < numCard; k++) {
          int check = blackJack - (cards[i] + cards[j] + cards[k]);
          if (check >= 0 && result > check) {
            result = check;
          }
        }
      }
    }
    System.out.println(blackJack - result);
    scanner.close();

  }

}
