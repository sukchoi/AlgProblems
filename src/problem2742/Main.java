package problem2742;

import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      System.out.println(n - i);
    }
  }
}
