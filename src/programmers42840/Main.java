package programmers42840;
// https://school.programmers.co.kr/learn/courses/30/lessons/42840

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    StringTokenizer stringTokenizer = new StringTokenizer(str);
    int[] answers = new int[stringTokenizer.countTokens()];
    int j = 0;
    while (stringTokenizer.hasMoreTokens()) {
      answers[j] = Integer.parseInt(stringTokenizer.nextToken());
      j++;
    }

    int one = 0;
    int two = 0;
    int three = 0;

    for (int i = 0; i < answers.length; i++) {
      if (answers[i] == (i % 5 + 1))
        one++;
    }

    for (int i = 0; i < answers.length; i++) {
      int answer = (i % 2 == 0 ? 2 : 0);
      if (answer == 0) {
        switch (i % 8) {
          case 1:
            answer = 1;
            break;
          case 3:
            answer = 3;
            break;
          case 5:
            answer = 4;
            break;
          case 7:
            answer = 5;
            break;

          default:
            break;
        }
      }
      if (answers[i] == answer)
        two++;
    }
    // 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ... 31245
    for (int i = 0; i < answers.length; i++) {
      int answer = 0;
      switch (i % 10) {
        case 0:
        case 1:
          answer = 3;
          break;
        case 2:
        case 3:
          answer = 1;
          break;

        case 4:
        case 5:
          answer = 2;
          break;

        case 6:
        case 7:
          answer = 4;
          break;
        case 8:
        case 9:
          answer = 5;
          break;
      }
      if (answers[i] == answer)
        three++;
    }
    int[] array = { one, two, three };

    Arrays.sort(array);
    int max = array[2];

    ArrayList<Integer> answer1 = new ArrayList<>();
    if (max == one)
      answer1.add(1);
    if (max == two)
      answer1.add(2);
    if (max == three)
      answer1.add(3);

    int[] answer = new int[answer1.size()];

    for (int i = 0; i < answer1.size(); i++) {
      answer[i] = answer1.get(i);
    }

  }
}

// 테스트 1 〉 통과 (0.53ms, 71.5MB)
// 테스트 2 〉 통과 (0.40ms, 79.3MB)
// 테스트 3 〉 통과 (0.41ms, 77.8MB)
// 테스트 4 〉 통과 (0.52ms, 76.3MB)
// 테스트 5 〉 통과 (0.34ms, 78.1MB)
// 테스트 6 〉 통과 (0.60ms, 76.5MB)
// 테스트 7 〉 통과 (1.11ms, 72.7MB)
// 테스트 8 〉 통과 (0.59ms, 77.9MB)
// 테스트 9 〉 통과 (1.26ms, 74.9MB)
// 테스트 10 〉 통과 (1.09ms, 72.9MB)
// 테스트 11 〉 통과 (1.32ms, 70.8MB)
// 테스트 12 〉 통과 (1.32ms, 77.5MB)
// 테스트 13 〉 통과 (0.43ms, 73.9MB)
// 테스트 14 〉 통과 (1.38ms, 76.1MB)