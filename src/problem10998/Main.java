package problem10998;

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

    int x = Integer.parseInt(stk.nextToken());
    int y = Integer.parseInt(stk.nextToken());

    System.out.println(x * y);

  }
}
