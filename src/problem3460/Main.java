package problem3460;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int testCase = scanner.nextInt();
    int[] tests = new int[testCase];
    for (int i = 0; i < testCase; i++) {
      tests [i] = scanner.nextInt();
    }
    for(int i=0; i< testCase; i++) {
      for (int j =0 ; j < 20; j++) {
        int temp = tests[i]>>j;
        int mask = 1;
        temp = temp&mask;
        if(temp==1) {
          System.out.print(j + " ");
        }
        
      }
    }
  }

}
