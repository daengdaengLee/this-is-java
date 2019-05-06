package exercise.no02;

public class Container<T> {
  private T value;

  public void set(T t) {
    this.value = t;
  }

  public T get() {
    return value;
  }
}
