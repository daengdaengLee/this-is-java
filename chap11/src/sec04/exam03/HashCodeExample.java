package sec04.exam03;

import java.util.Objects;

public class HashCodeExample {
  public static void main(String[] args) {
    Student s1 = new Student(1, "홍길동");
    Student s2 = new Student(1, "홍길동");

    System.out.println(s1.hashCode());
    System.out.println(Objects.hashCode(s2));
  }
}
