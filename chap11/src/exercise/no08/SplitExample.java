package exercise.no08;

import java.util.StringTokenizer;

public class SplitExample {
  public static void main(String[] args) {
    String str = "아이디,이름,패스워드";

    // 방법 1
    String[] items1 = str.split(",");
    for (String item : items1) {
      System.out.println(item);
    }

    System.out.println();

    // 방법 2
    StringTokenizer st = new StringTokenizer(str, ",");
    while (st.hasMoreTokens()) {
      String token = st.nextToken();
      System.out.println(token);
    }
  }
}
