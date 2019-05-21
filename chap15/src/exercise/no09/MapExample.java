package exercise.no09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("blue", 96);
    map.put("hong", 86);
    map.put("white", 92);

    String name = null;
    int maxScore = 0;
    int totalScore = 0;

    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
    Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
    while (iterator.hasNext()) {
      Map.Entry<String, Integer> entry = iterator.next();

      totalScore += entry.getValue();

      if (entry.getValue() > maxScore) {
        name = entry.getKey();
        maxScore = entry.getValue();
      }
    }

    int meanScore = totalScore / map.size();

    System.out.println("평균점수: " + meanScore);
    System.out.println("최고점수: " + maxScore);
    System.out.println("최고점수를 받은 아이디: " + name);
  }
}
