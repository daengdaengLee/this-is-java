package sec08.exam02;

import java.util.StringTokenizer;

public class StringTokenizerExample2 {
  public static void main(String[] args) {
    String text = "홍길동/이수홍/박연수";

    StringTokenizer st = new StringTokenizer(text, "/");
    while (st.hasMoreTokens()) {
      String token = st.nextToken();
      System.out.println(token);
    }
  }
}
