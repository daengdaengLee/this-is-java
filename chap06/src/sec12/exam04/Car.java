package sec12.exam04;

import sec12.exam03.hankook.*;
import sec12.exam03.hyndai.Engine;
import sec12.exam03.kumho.*;

public class Car {
  // 필드
  Engine engine = new Engine();
  SnowTire tire1 = new SnowTire();
  BigWidthTire tire2 = new BigWidthTire();
  sec12.exam03.hankook.Tire tire3 = new sec12.exam03.hankook.Tire();
  sec12.exam03.kumho.Tire tire4 = new sec12.exam03.kumho.Tire();
}
