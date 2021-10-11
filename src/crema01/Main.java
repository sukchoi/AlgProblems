package crema01;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<String> dates = new ArrayList<>();
    dates.add("20th Oct 2052");
    dates.add("4th Nov 2030");
    for (String s : dates) {

      // day;
      String day;
      String month;
      String year;
      if (s.charAt(1) > 'a' && s.charAt(1) < 'z') {
        StringBuilder strb = new StringBuilder();
        strb.append('0');
        strb.append(s.substring(0, 1));
        day = strb.toString();
        month = s.substring(4, 7);
        month = processMonth(month);
        year = s.substring(8);
      } else {
        StringBuilder strb = new StringBuilder();
        strb.append(s.substring(0, 2));
        day = strb.toString();
        month = s.substring(5, 8);
        month = processMonth(month);
        year = s.substring(9);

      }

      // Month

      // Year
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(year);
      stringBuilder.append('-');
      stringBuilder.append(month);
      stringBuilder.append('-');
      stringBuilder.append(day);

      String date = stringBuilder.toString();
      System.out.println(date);
    }

  }

  public static String processMonth(String month) {
    switch (month) {
      case "Jan":
        month = "01";
        break;
      case "Feb":
        month = "02";
        break;
      case "Mar":
        month = "03";
        break;
      case "Apr":
        month = "04";
        break;
      case "May":
        month = "05";
        break;
      case "Jun":
        month = "06";
        break;
      case "Jul":
        month = "07";
        break;
      case "Aug":
        month = "08";
        break;
      case "Sep":
        month = "09";
        break;
      case "Oct":
        month = "10";
        break;
      case "Nov":
        month = "11";
        break;
      case "Dec":
        month = "12";
        break;
    }
    return month;
  }
}
