/**
 * BicycleDemo is a class that is going to utilise another class called Bicycle
 * to instantiate an objects and use it's mehtods.
 */

public class BicycleDemo {

  public static void main(String[] args) {

    Bicycle bike1 = new Bicycle();
    bike1.speedUp(10);
    bike1.changeGear(2);
    bike1.printInfo();

    MountainBike bike2 = new MountainBike();
    bike2.printInfor();

  }
}

interface BicycleInterface {
  void printInfo();
  void changeGear(int value);
}

class Bicycle implements BicycleInterface {
  int speed = 0;
  int cadence = 0;
  int gear = 0;

  void speedUp(int value) {
    speed = speed + value;
  }

  void brake(int value) {
    speed = speed - value;
  }

  void changeCadence(int value) {
    cadence = value;
  }

 public void changeGear(int value) {
    gear = value;
  }

  public void printInfo() {
    System.out.println("speed: " + speed);
    System.out.println("cadence: " + cadence);
    System.out.println("gear: " + gear);
  }
}

class MountainBike extends Bicycle {
  int strength = 100;

   void printInfor() {
    System.out.println("strength: " + strength);
  }
}
