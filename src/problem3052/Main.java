package problem3052;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] modulo = new int[10];
    for (int i = 0; i < 10; i++) {
      modulo[i] = sc.nextInt() % 42;
    }
    int count = 10;
    for (int i = 0; i < modulo.length; i++) {
      for (int j = i + 1; j < modulo.length; j++) {
        if (modulo[j] == -1)
          continue;
        if (modulo[i] == modulo[j]) {
          count--;
          modulo[j] = -1;
        } 
      }
    }
    sc.close();
    System.out.println(count);

  }

}
