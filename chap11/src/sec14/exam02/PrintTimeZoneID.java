package sec14.exam02;

import java.util.TimeZone;

public class PrintTimeZoneID {
  public static void main(String[] args) {
    String[] availableIDs = TimeZone.getAvailableIDs();
    for (String id : availableIDs) {
      System.out.println(id);
    }
  }
}
