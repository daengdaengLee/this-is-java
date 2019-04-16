package exercise.no06;

public class Chatting {
  void startChat(String chatId) {
    String nickName = null;
    nickName = chatId; // final 특성을 갖기 때문에 재할당 불가능
    Chat chat = new Chat() {
      @Override
      void start() {
        while (true) {
          String inputData = "안녕하세요";
          String message = "[" + nickName + "]" + inputData;
          sendMessage(message);
        }
      }
    };
  }

  class Chat {
    void start() {
    }

    void sendMessage(String message) {
    }
  }
}
