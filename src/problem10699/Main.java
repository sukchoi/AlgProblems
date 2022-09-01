package problem10699;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    LocalDate localdate = LocalDate.now();
    DateTimeFormatter x = DateTimeFormatter.ofPattern("uuuu-MM-dd");
    System.out.println(x.format(localdate));
  }
}
