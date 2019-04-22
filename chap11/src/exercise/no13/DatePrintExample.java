package exercise.no13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {
  public static void main(String[] args) {
    Date now = new Date();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E KK시 mm분");
    System.out.println(sdf.format(now));
  }
}
