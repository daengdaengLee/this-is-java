package sec06.exam03;

public class JoinExample {
  public static void main(String[] args) {
    SumThread sumThread = new SumThread();
    sumThread.start();

    try {
      sumThread.join();
    } catch (InterruptedException e) {
    }

    System.out.println("1~1000000000 합: " + sumThread.getSum());
  }
}
