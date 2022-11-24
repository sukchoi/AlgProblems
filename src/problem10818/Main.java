package problem10818;

import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine().trim());
    int max = -1000000;
    int min = 1000000;
    StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

    for (int i = 0; i < n; i++) {
      int temp = Integer.parseInt(stk.nextToken().trim());
      if (temp > max) {
        max = temp;
      }
      if (temp < min) {
        min = temp;
      }
    }
    System.out.println(min + " " + max);

  }
}
