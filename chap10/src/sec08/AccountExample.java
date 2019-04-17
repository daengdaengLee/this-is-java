package sec08;

import sec07.exam01.BalanceInsufficientException;
import sec07.exam02.Account;

public class AccountExample {
  public static void main(String[] args) {
    Account account = new Account();

    account.deposit(10000);
    System.out.println("예금액: " + account.getBalance());

    try {
      account.withdraw(30000);
    } catch (BalanceInsufficientException e) {
      String message = e.getMessage();
      System.out.println(message);
      System.out.println();
      e.printStackTrace();
    }
  }
}
