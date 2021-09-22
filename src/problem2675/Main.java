package problem2675;

import java.util.*;

// 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
// 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

// QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int testCase = scanner.nextInt();
    int[] rpt = new int[testCase];
    String[] str = new String[testCase];
    for (int i = 0; i < testCase; i++) {
      rpt[i] = scanner.nextInt();

      str[i] = scanner.nextLine().trim();
      // str[i] = str[i].trim();
    }
    for (int i = 0; i < testCase; i++) {
      for (int j = 0; j < str[i].length(); j++) {
        for (int k = 0; k < rpt[i]; k++) {
          System.out.print(str[i].charAt(j));
        }
      }
      System.out.println();
    }
    scanner.close();
  }

}
