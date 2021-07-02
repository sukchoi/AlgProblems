package problem2902;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    scanner.close();
    StringTokenizer stk = new StringTokenizer(str, "-");
    while (stk.hasMoreTokens())
      System.out.print(stk.nextToken().charAt(0));
    
  }

}
