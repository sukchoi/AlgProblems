package problem2908;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String strX = sc.next();
    String strY = sc.next();

    char[] arrX = strX.toCharArray();
    char[] arrY = strY.toCharArray();
    char[] revArrX = new char[3];
    char[] revArrY = new char[3];
    for (int i = 0; i < arrX.length; i++) {
      revArrX[arrX.length - i - 1] = arrX[i];
      revArrY[arrX.length - i - 1] = arrY[i];
    }
    int x = Integer.parseInt(new String(revArrX));
    int y = Integer.parseInt(new String(revArrY));
    sc.close();
    // compare
    System.out.println((x > y ? x : y));
  }

}
