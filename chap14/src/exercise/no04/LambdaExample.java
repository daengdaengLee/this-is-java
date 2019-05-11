package exercise.no04;

import java.util.function.IntSupplier;

public class LambdaExample {
  public static int method(int x, int y) {
    IntSupplier supplier = () -> {
      /*
      Compile Error
      람다식 내부에서 메소드 매개변수를 참조하는 경우
      해당 매게변수는 final 변수로 처리

      x *= 10;
      int result = x + y;
      */

      int z = x * 10;
      int result = z + y;
      return result;
    };
    int result = supplier.getAsInt();
    return result;
  }

  public static void main(String[] args) {
    System.out.println(method(3, 5));
  }
}
