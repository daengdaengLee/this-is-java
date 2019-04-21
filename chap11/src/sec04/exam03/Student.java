package sec04.exam03;

import java.util.Objects;

public class Student {
  int sno;
  String name;

  public Student(int sno, String name) {
    this.sno = sno;
    this.name = name;
  }

  @Override
  public int hashCode() {
    return Objects.hash(sno, name);
  }
}
