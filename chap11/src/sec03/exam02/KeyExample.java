package sec03.exam02;

import java.util.HashMap;

public class KeyExample {
  public static void main(String[] args) {
    HashMap<Key1, String> hashMap1 = new HashMap<Key1, String>();

    hashMap1.put(new Key1(1), "홍길동");

    String value1 = hashMap1.get(new Key1(1));
    System.out.println(value1);

    HashMap<Key2, String> hashMap2 = new HashMap<Key2, String>();

    hashMap2.put(new Key2(1), "홍길동");

    String value2 = hashMap2.get(new Key2(1));
    System.out.println(value2);
  }
}
