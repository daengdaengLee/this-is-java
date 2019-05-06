package sec04.exam02;

public class UsingLocalVariable {
  void method(int arg) {
    int localVar = 40;

    // final 특성 때문에 수정 불가
//    arg = 31;
//    localVar = 41;

    MyFunctionalInterface fi = () -> {
      System.out.println("arg : " + arg);
      System.out.println("localVar : " + localVar);
    };
    fi.method();
  }
}
