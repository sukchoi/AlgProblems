package problem2753;

import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int year = Integer.valueOf(br.readLine());
    // 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
    if (isLeap(year)) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }

  public static boolean isLeap(int year) {
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          return true;
        }
        return false;
      }
      return true;
    } else
      return false;
  }
}
