package problem7569;

import java.io.*;
import java.util.*;

public class Main {
  public static int[] dx = { -1, 1, 0, 0, 0, 0 }; // 앞뒤좌우상하
  public static int[] dy = { 0, 0, -1, 1, 0, 0 };
  public static int[] dz = { 0, 0, 0, 0, -1, 1 };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    String[] hmn = str.split(" ");
    int h = Integer.parseInt(hmn[2]);
    int m = Integer.parseInt(hmn[0]);
    int n = Integer.parseInt(hmn[1]);

    int[][][] box;
    box = new int[h][n][m];

    for (int i = 0; i < n; i++) {
      // parse the line
      str = br.readLine();
      String[] temp = str.split(" ");
      for (String s : temp) {

      }
      for (int j = 0; j < n; j++) {

      }
    }
  }

}
