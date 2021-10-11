package HackerRank3;

public class Main {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = Integer.parseInt(sc.nextLine());
    // int[] arr = new int[n];
    // for (int i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();
    // }

    String s = "12:45:54PM";
    String hourS = s.substring(0, 2);
    int hourI = Integer.parseInt(hourS);
    char ampm = s.charAt(8);

    if (ampm == 'A') {
      // no adding
      if (hourI == 12) {
        hourI = 00;
      }
      StringBuilder stringBuilder = new StringBuilder();
      if (hourI < 10) {
        stringBuilder.append('0');
      }
      stringBuilder.append(hourI);
      stringBuilder.append(s.substring(2, 8));
      String result = stringBuilder.toString();
      System.out.println(result);
    } else {
      // add 12
      if (hourI != 12) {
        hourI += 12;
      }
      StringBuilder stringBuilder = new StringBuilder();
      if (hourI < 10) {
        stringBuilder.append('0');
      }
      stringBuilder.append(hourI);

      stringBuilder.append(s.substring(2, 8));
      String result = stringBuilder.toString();
      System.out.println(result);
    }

  }
}
