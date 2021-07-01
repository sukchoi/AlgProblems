package problem10809;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    scanner.close();

    char[] charArr = str.toCharArray();

    int[] result = new int[26];
    for (int i = 0; i < result.length; i++) {
      result[i] = -1;
    }
    for (int i = 0; i < charArr.length; i++) {
      int index = charArr[i] - 'a';
      if (result[index] == -1)
        result[index] = i;
    }
    for (int i : result)
      System.out.print(i + " ");
  }
}
// 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1

