package problem2941;

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    for (int i = 0; i < str.length(); i++)
      System.out.println(str.charAt(i));
  }
}
