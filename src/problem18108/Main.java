package problem18108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    int n = Integer.parseInt(s);
    int diff = 2541 - 1998;
    System.out.println(n - diff);
  }
}
