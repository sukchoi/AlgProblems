package problem15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
      int a = Integer.parseInt(stk.nextToken());
      int b = Integer.parseInt(stk.nextToken());
      int sum = a + b;
      bw.write(String.valueOf(sum) + "\n");
    }

    bw.flush();
    br.close();
  }
}