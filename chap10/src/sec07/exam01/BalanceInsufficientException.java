package sec07.exam01;

public class BalanceInsufficientException extends Exception {
  public BalanceInsufficientException() {
  }

  public BalanceInsufficientException(String message) {
    super(message);
  }
}
