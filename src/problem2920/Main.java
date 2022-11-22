package problem2920;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
    int n = 8;
    int[] num = new int[n];
    for (int i = 0; i < n; i++) {
      num[i] = Integer.parseInt(stk.nextToken());
    }
    String answer = " ";
    for (int i = 0; i < n - 2; i++) {
      int diff1 = num[i] - num[i + 1];
      int diff2 = num[i + 1] - num[i + 2];
      if (diff1 != diff2 || Math.abs(diff1) != 1 || Math.abs(diff2) != 1) {
        answer = "mixed";
        break;
      }
      if (diff1 < 0) {
        answer = "ascending";
      } else {
        answer = "descending";
      }

    }
    System.out.println(answer);
  }
}
