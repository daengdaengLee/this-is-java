package sec07.exam01;

import java.io.IOException;

public class KeyboardToStringExample {
  public static void main(String[] args) {
    byte[] bytes = new byte[100];
    int readByteNo = 1;

    System.out.print("입력: ");
    try {
      readByteNo = System.in.read(bytes);
    } catch (IOException e) {
      e.printStackTrace();
    }

    String str = new String(bytes, 0, readByteNo - 1);
    System.out.println(str);
  }
}
