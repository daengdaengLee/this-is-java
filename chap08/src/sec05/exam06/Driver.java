package sec05.exam06;

public class Driver {
  public void drive(Vehicle vehicle) {
    if (vehicle instanceof Bus) {
      Bus bus = (Bus) vehicle;
      bus.checkFare();
    }
    vehicle.run();
  }
}
