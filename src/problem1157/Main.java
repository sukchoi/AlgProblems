// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//
// 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//
// 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.


package problem1157;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    scanner.close();
    int[] countArray = new int[26];

    // count letters and store them to countArray
    for (int i = 0; i < str.length(); i++) {
      if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
        int x = str.charAt(i) - 'A';
        countArray[x]++;
      } else {
        int x = str.charAt(i) - 'a';
        countArray[x]++;
      }
    }
    // search the biggest number in count Array
    int temp = -1;
    char index = '?';
    for (int i = 0; i < countArray.length; i++) {
      if (temp < countArray[i]) {
        index = (char) i;
        temp = countArray[i];
      } else if (temp == countArray[i]) {
        temp = countArray[i];
        index = '?';
      }
    }
    if (index != '?')
      System.out.println((char)(index + 'A'));
    else
      System.out.println(index);
  }
}
