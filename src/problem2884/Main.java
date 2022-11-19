package problem2884;

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
    int h = Integer.parseInt(stk.nextToken());
    int m = Integer.parseInt(stk.nextToken());

    int fixedAlarmMin = h * 60 + m - 45;

    if (fixedAlarmMin < 0)
      fixedAlarmMin += (24 * 60);
    h = fixedAlarmMin / 60;
    m = fixedAlarmMin % 60;
    System.out.println(h + " " + m);
  }
}
