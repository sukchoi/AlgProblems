package problem11654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    // A=65
    // a=97
    // 0=48
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    char c = str.charAt(0);

    int i = Character.valueOf(c);
    System.out.println(i);

  }
}
