package exercise.no04;

public class Util {
  public static <K, V> V getValue(Pair<K, V> pair, K key) {
    if (pair.getKey() == key) return pair.getValue();
    return null;
  }
}
