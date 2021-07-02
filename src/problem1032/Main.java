package problem1032;

import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = Integer.parseInt(scanner.nextLine());
    String[] name = new String[num];
    for (int i = 0; i < num; i++) {
      name[i] = scanner.nextLine();
    }
    scanner.close();
    int fIndex = 0, bIndex = name[0].length() - 1;
    for (int i = 1; i < num; i++) { // span every word
      for (int j = fIndex; j < bIndex; j++) { // Forward search first same letter
        for (int k = bIndex; k > j; k--) { // Backward search first same letter
          if (name[0].charAt(k) == name[i].charAt(k)) {
            bIndex = k;
            // System.out.println(name[i].charAt(k));
            break;
          }
        }
        if (name[0].charAt(j) == name[i].charAt(j)) {
          fIndex = j;
          break;
        }
      }
    }
    String str = name[0].substring(fIndex, bIndex + 1);
    for (int i = 0; i < bIndex-1; i++)
      str = str.concat("?");
    System.out.println(str);
  }
}
