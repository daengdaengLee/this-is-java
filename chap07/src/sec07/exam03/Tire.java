package sec07.exam03;

public class Tire {
  public int maxRotation;
  public int accumulatedRotaion;
  public String location;

  public Tire(String location, int maxRotation) {
    this.location = location;
    this.maxRotation = maxRotation;
  }

  public boolean roll() {
    ++accumulatedRotaion;
    if (accumulatedRotaion < maxRotation) {
      System.out.println(location + " Tire 수명 : " + (maxRotation - accumulatedRotaion) + "회");
      return true;
    } else {
      System.out.println("*** " + location + " Tire 펑크 ***");
      return false;
    }
  }
}
