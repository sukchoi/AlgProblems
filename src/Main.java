import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    String s = sc.nextLine();
//    char[] chArr = s.toCharArray();
//
//
//    String str = new String(chArr);
//    int newInt = Integer.parseInt(str);
//    int answer = newInt;
//    System.out.println(answer);
    LinkedList<Character> ll = new LinkedList<>();
    String s = "baabaa";
    char[] chArr = s.toCharArray();
    for (char c : chArr) {
      ll.add(c);
    }
    while (!ll.isEmpty()) {
      for (int i = 0; i < ll.size() - 1; i++) {
        if (i == ll.size() - 1)
          continue;
        if (ll.get(i) == ll.get(i + 1)) {
          ll.remove(i);
          ll.remove(i);
          break;
        }
        System.out.println(ll);
      }
    }
    
    
  }
}
