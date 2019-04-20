package sec03.exam02;

public class Key1 {
  public int number;

  public Key1(int number) {
    this.number = number;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Key1) {
      Key1 compareKey = (Key1) obj;
      if (this.number == compareKey.number) {
        return true;
      }
    }

    return false;
  }
}
