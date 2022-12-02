package problem4153;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
      int[] sides = new int[3];
      for (int i = 0; i < sides.length; i++) {
        sides[i] = Integer.parseInt(stk.nextToken());
      }
    }
  }
}
