package problem2577;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 150
    // 266
    // 427
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int res = a * b * c;
    // System.out.println(res);
    String numStr = Integer.toString(res);
    char[] numArr = numStr.toCharArray();
    int[] numArrCp = new int[numArr.length];
    for (int i = 0; i < numArr.length; i++) {
      numArrCp[i] = numArr[i] - 48;
    }
    int[] counts = new int[10];
    for (int i = 0; i < counts.length; i++) {
      for (int j = 0; j < numArrCp.length; j++) {
        if (i == numArrCp[j]) {
          counts[i]++;
        }
      }
    }
    
    int[] array = new int[10];
    while (res != 0) {
      array[res%10]++;
      res/=10;
    }
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

}
