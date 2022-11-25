package problem9498;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int score = Integer.parseInt(br.readLine().trim());
    char letter;
    if (score >= 90)
      letter = 'A';
    else if (score <= 89 && score >= 80)
      letter = 'B';
    else if (score <= 79 && score >= 70)
      letter = 'C';
    else if (score <= 69 && score >= 60)
      letter = 'D';
    else
      letter = 'F';
    System.out.println(letter);
  }
}
