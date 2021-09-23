package problem1018;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int y = scanner.nextInt();
    int x = scanner.nextInt();
    String[] board = new String[y];
    scanner.nextLine();
    for (int i = 0; i < y; i++) {
      board[i] = scanner.nextLine();
    }

    int count = 50 * 50;
    // cutting board
    for (int i = 0; i <= y - 8; i++) {
      for (int j = 0; j <= x - 8; j++) {
        int paintCnt1 = 0;
        int paintCnt2 = 0;
        // painting board
        for (int m = i; m < i + 8; m++) {
          for (int n = j; n < j + 8; n++) {
            if ((m + n) % 2 == 0) {
              // paint white
              if (isBlack(board[m].charAt(n))) {
                paintCnt1++;
              }
            } else {
              // paint black
              if (isWhite(board[m].charAt(n))) {
                paintCnt1++;
              }
            }
          }
        }
        for (int m = i; m < i + 8; m++) {
          for (int n = j; n < j + 8; n++) {
            if ((m + n) % 2 == 0) {
              // paint black
              if (isWhite(board[m].charAt(n))) {
                paintCnt2++;
              }
            } else {
              // paint white
              if (isBlack(board[m].charAt(n))) {
                paintCnt2++;
              }
            }

          }
        }
        paintCnt1 = paintCnt1 < paintCnt2 ? paintCnt1 : paintCnt2;
        if (paintCnt1 < count) {
          count = paintCnt1;
        }
      }
    }
    System.out.println(count);
    scanner.close();

  }

  public static boolean isBlack(char c) {
    return c == 'B' ? true : false;

  }

  public static boolean isWhite(char c) {
    return c == 'W' ? true : false;
  }
}
