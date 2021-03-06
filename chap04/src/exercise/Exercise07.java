package exercise;

import java.util.Scanner;

public class Exercise07 {

  public static void main(String[] args) {
    boolean run = true;
    
    int balance = 0;
    
    Scanner scanner = new Scanner(System.in);
    
    while(run) {
      System.out.println("--------------------");
      System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
      System.out.println("--------------------");
      System.out.print("선택> ");
      
      String command  = scanner.nextLine();
      
      if (command.equals("1")) {
        System.out.print("예금액> ");
        String inputString = scanner.nextLine();
        int inputInt = Integer.parseInt(inputString);
        balance += inputInt;
      } else if (command.equals("2")) {
        System.out.print("출금액> ");
        String inputString = scanner.nextLine();
        int inputInt = Integer.parseInt(inputString);
        balance -= inputInt;
      } else if (command.equals("3")) {
        System.out.println("잔고> " + balance);
      } else if (command.equals("4")) {
        break;
      }
    }
    
    scanner.close();
    System.out.println("프로그램 종료");
  }

}
