package sec07.exam01;

public class ChildExample {

  public static void main(String[] args) {
    Child child = new Child();

    Parent parent = child; // 자동 타입 변환
    parent.method1();
    parent.method2(); // 재정의도니 메소드가 호출됨
    // parent.method3(); (호출 불가능)
  }

}
