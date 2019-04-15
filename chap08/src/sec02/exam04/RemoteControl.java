package sec02.exam04;

public interface RemoteControl {
  int MAX_VOLUMNE = 10;
  int MIN_VOLUMNE = 0;

  void turnOn();

  void turnOff();

  void setVolume(int volume);

  default void setMute(boolean mute) {
    if (mute) {
      System.out.println("무음 처리합니다.");
    } else {
      System.out.println("무음 해제합니다.");
    }
  }
}
