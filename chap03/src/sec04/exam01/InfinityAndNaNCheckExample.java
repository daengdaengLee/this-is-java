package sec04.exam01;

public class InfinityAndNaNCheckExample {

  public static void main(String[] args) {
    int x = 5;
    double y = 0.0;
    
    double z1 = x / y;
    double z2 = x % y;
    
    System.out.println(Double.isInfinite(z1));
    System.out.println(Double.isNaN(z2));
    
    System.out.println(z1 + 2); // 문제가 되는 코드
    System.out.println(z2 + 2); // 문제가 되는 코드
  }

}
