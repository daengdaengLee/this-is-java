package sec03;

public class ProductExample {
  public static void main(String[] args) {
//    Product<Tv, String> product1 = new Product<Tv, String>();
    Product<Tv, String> product1 = new Product<>(); // 자바 7부터 가능
    product1.setKind(new Tv());
    product1.setModel("스마트Tv");
    Tv tv = product1.getKind();
    String tvModel = product1.getModel();
    System.out.println(tv.toString() + " - " + tvModel);

//    Product<Car, String> product2 = new Product<Car, String>();
    Product<Car, String> product2 = new Product<>(); // 자바 7부터 가능
    product2.setKind(new Car());
    product2.setModel("디젤");
    Car car = product2.getKind();
    String carModel = product2.getModel();
    System.out.println(car.toString() + " - " + carModel);
  }
}
