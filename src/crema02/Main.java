package crema02;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    int input = 112233445;

    long max = 0;
    long min = 1000 * 1000 * 1000;

    for (int i = 0; i <= 9; i++) { // 원래 숫자

      for (int j = 0; j <= 9; j++) { // 바꿀 숫자
        StringBuilder stb = new StringBuilder();
        stb.append(input);
        for (int k = 0; k < stb.length(); k++) { // 자리수
          if (k == 0 && j == 0)
            continue;
          if (stb.charAt(k) == '0' + i) {
            StringBuilder temp = new StringBuilder();
            temp.append(j);
            stb.replace(k, k + 1, temp.toString());

          }
        }

        long newInput = Long.parseLong(stb.toString());
        max = Math.max(newInput, max);
        min = Math.min(newInput, min);
        // System.out.println(stb);

      }

    }

    System.out.println(max);
    System.out.println(min);
    System.out.println(max - min);
  }
}
