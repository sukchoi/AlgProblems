package problem1181;

import java.util.*;

// 실패: 시간 초과 

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.nextLine());
    String[] words = new String[N];
    for (int i = 0; i < N; i++) {
      words[i] = scanner.nextLine();
    }
    // Sort words
    // Print words (exclude repeated words)
    sortWords(words);
    printWords(words);

    scanner.close();

  }

  public static void sortWords(String[] words) {
    for (int i = 0; i < words.length; i++) {
      for (int j = 0; j < words.length - 1 - i; j++) {
        swapWords(words, j);
      }
    }
  }

  public static void swapWords(String[] words, int j) {
    if (words[j].length() > words[j + 1].length()) {
      String temp = words[j + 1];
      words[j + 1] = words[j];
      words[j] = temp;
    } else if (words[j].length() == words[j + 1].length()) {
      if (words[j].compareTo(words[j + 1]) > 0) {
        String temp = words[j + 1];
        words[j + 1] = words[j];
        words[j] = temp;
      }
    }

  }

  public static void printWords(String[] words) {
    for (int i = 0; i < words.length; i++) {
      if (i != 0 && words[i].equals(words[i - 1])) {
        i++;
        continue;
      }
      System.out.println(words[i]);
    }
  }
}
