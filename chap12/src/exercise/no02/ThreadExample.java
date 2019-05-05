package exercise.no02;

public class ThreadExample {
  public static void main(String[] args) {
    Thread thread1 = new MovieThread();
    thread1.start();

    Thread thread2 = new MusicThread();
    thread2.start();
  }
}
