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
      if (sides[0] == 0 && sides[1] == 0 && sides[2] == 0) {
        break;
      }
      if (sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2]) {
        System.out.println("right");
      } else if (sides[0] * sides[0] + sides[2] * sides[2] == sides[1] * sides[1]) {
        System.out.println("right");
      } else if (sides[2] * sides[2] + sides[1] * sides[1] == sides[0] * sides[0]) {
        System.out.println("right");
      } else {
        System.out.println("wrong");
      }
    }
  }
}
