package sec03.exam04;

import java.util.Arrays;

public class MemberDeep implements Cloneable {
  public String name;
  public int age;
  public int[] scores;
  public Car car;

  public MemberDeep(String name, int age, int[] scores, Car car) {
    this.name = name;
    this.age = age;
    this.scores = scores;
    this.car = car;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    MemberDeep cloned = (MemberDeep) super.clone();
    cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
    cloned.car = new Car(this.car.model);
    return cloned;
  }

  public MemberDeep getMember() {
    MemberDeep cloned = null;
    try {
      cloned = (MemberDeep) clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return cloned;
  }
}
