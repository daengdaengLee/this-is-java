package sec03.exam02;

public class Key2 {
  public int number;

  public Key2(int number) {
    this.number = number;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Key2) {
      Key2 compareKey = (Key2) obj;
      if (this.number == compareKey.number) {
        return true;
      }
    }

    return false;
  }

  @Override
  public int hashCode() {
    return number;
  }
}
