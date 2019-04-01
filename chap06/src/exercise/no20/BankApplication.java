package exercise.no20;

import java.util.Scanner;

public class BankApplication {
  private static Account[] accountArray = new Account[100];
  private static Scanner scanner = new Scanner(System.in);
  private static int accountIdx = 0;

  public static void main(String[] args) {
    boolean run = true;
    while (run) {
      System.out.println("----------------------------------------");
      System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
      System.out.println("----------------------------------------");
      System.out.print("선택> ");

      int selectNo = scanner.nextInt();

      if (selectNo == 1) {
        createAccount();
      } else if (selectNo == 2) {
        accountList();
      } else if (selectNo == 3) {
        deposit();
      } else if (selectNo == 4) {
        withdraw();
      } else if (selectNo == 5) {
        run = false;
      }
    }
    System.out.println("프로그램 종료");
  }

  // 계좌생성하기
  private static void createAccount() {
    String ano;
    String owner;
    int balance;

    System.out.println("----------");
    System.out.println("계좌생성");
    System.out.println("----------");

    scanner.nextLine();

    System.out.print("계좌번호: ");
    ano = scanner.nextLine();
    System.out.print("계좌주: ");
    owner = scanner.nextLine();
    System.out.print("초기입금액: ");
    balance = scanner.nextInt();
    scanner.nextLine();

    Account account = new Account(ano, owner, balance);

    if (accountIdx >= accountArray.length) {
      Account[] newAccountArray = new Account[accountArray.length * 2];
      System.arraycopy(accountArray, 0, newAccountArray, 0, accountArray.length);
      accountArray = newAccountArray;
    }

    accountArray[accountIdx] = account;
    accountIdx += 1;

    System.out.println("결과: 계좌가 생성되었습니다.");
  }

  // 계좌목록보기
  private static void accountList() {
    System.out.println("----------");
    System.out.println("계좌목록");
    System.out.println("----------");

    for (Account account : accountArray) {
      if (account == null)
        continue;

      System.out.println(account.getAno() + "     " + account.getOwner() + "     " + account.getBalance());
    }
  }

  // 예금하기
  private static void deposit() {
    String ano;
    int depositAmount;

    System.out.println("----------");
    System.out.println("예금");
    System.out.println("----------");

    scanner.nextLine();

    System.out.print("계좌번호: ");
    ano = scanner.nextLine();
    System.out.print("예금액: ");
    depositAmount = scanner.nextInt();
    scanner.nextLine();

    Account account = findAccount(ano);

    if (account == null)
      return;

    account.setBalance(account.getBalance() + depositAmount);

    System.out.println("결과: 예금이 성공되었습니다.");
  }

  // 출금하기
  private static void withdraw() {
    String ano;
    int withdrawAmount;

    System.out.println("----------");
    System.out.println("출금");
    System.out.println("----------");

    scanner.nextLine();

    System.out.print("계좌번호: ");
    ano = scanner.nextLine();
    System.out.print("출금액: ");
    withdrawAmount = scanner.nextInt();
    scanner.nextLine();

    Account account = findAccount(ano);

    if (account == null)
      return;

    account.setBalance(account.getBalance() - withdrawAmount);

    System.out.println("결과: 출금이 성공되었습니다.");
  }

  // Account 배열에서 ano와 동일한 Account 객체 찾기
  private static Account findAccount(String ano) {
    for (Account account : accountArray) {
      if (ano.equals(account.getAno()))
        return account;
    }

    return null;
  }
}
