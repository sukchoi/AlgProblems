package problem11720;

import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine().trim());
    int sum = 0;
    String nums = br.readLine().trim();
    for (int i = 0; i < n; i++) {
      sum += Character.valueOf(nums.charAt(i)) - 48;
    }
    System.out.println(sum);
  }
}
