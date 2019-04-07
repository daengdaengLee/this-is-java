package sec07.exam02;

public class KumhoTire extends Tire {
  public KumhoTire(String location, int maxRotation) {
    super(location, maxRotation);
  }

  @Override
  public boolean roll() {
    ++accumulatedRotaion;
    if (accumulatedRotaion < maxRotation) {
      System.out.println(location + " KunhoTire 수명 : " + (maxRotation - accumulatedRotaion) + "회");
      return true;
    } else {
      System.out.println("*** " + location + " KumhoTire 펑크 ***");
      return false;
    }
  }
}
