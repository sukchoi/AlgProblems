package problem11382;

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk = new StringTokenizer(br.readLine());
    Long a, b, c;
    a = Long.parseLong(stk.nextToken());
    b = Long.parseLong(stk.nextToken());
    c = Long.parseLong(stk.nextToken());
    System.out.println(a + b + c);

  }

}
