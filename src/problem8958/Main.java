package problem8958;

import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    String[] arr = new String[num];
    for (int i = 0; i < num; i++) {
      arr[i] = br.readLine();
    }
    // charAt 을 이용해서 카운팅
    for (int i = 0; i < num; i++) {
      int count = 0;
      int sum = 0;

      for (int j = 0; j < arr[i].length(); j++) {
        if (arr[i].charAt(j) == 'O') {
          count++;
          sum += count;
        } else {
          count = 0;
        }
      }
      System.out.println(sum);
    }
  }
}
