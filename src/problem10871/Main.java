package problem10871;

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
    int n = Integer.parseInt(stk.nextToken());
    int x = Integer.parseInt(stk.nextToken());
    // int[] nums = new int[n];

    stk = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < n; i++) {
      int y = Integer.parseInt(stk.nextToken());
      if (y < x) {
        System.out.print(y + " ");
      }

    }
  }
}
