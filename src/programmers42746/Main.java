package programmers42746;

// https://school.programmers.co.kr/learn/courses/30/lessons/42746 가장 큰 수

import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[] input = { 6, 3, 224, 553 };
    Solution s = new Solution();
    System.out.println(s.solution(input));
  }
}

class Solution {
  public String solution(int[] numbers) {

    String[] numStr = new String[numbers.length];
    int i = 0;
    for (int n : numbers) {
      numStr[i] = String.valueOf(n);
      i++;
    }

    Comparator<String> c = new Comparator<String>() {

      @Override
      public int compare(String s1, String s2) {

        return (s2 + s1).compareTo(s1 + s2);
      }

    };
    Arrays.sort(numStr, c);
    String answer = "";
    StringBuilder sb = new StringBuilder();

    for (String s : numStr) {

      sb.append(s);
      // StringBuilder is much faster and concatenation of string
      // answer+=s;

    }
    answer = sb.toString();
    if (numStr[0].equals("0")) {

      answer = "0";

    }
    return answer;
  }
}