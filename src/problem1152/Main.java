package problem1152;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    // System.out.println((int) ' ');

    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    str = str.trim();
    String[] splitStr = str.split(" ");

//    for (String s : splitStr)
//      System.out.println(s);
    if (splitStr[0] == "" )
      System.out.println(0);
    else
      System.out.println(splitStr.length);
  }

}
