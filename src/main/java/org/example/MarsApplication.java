package org.example;

public class MarsApplication {
    public static void main() {
        MarsRobot mr1 = new MarsRobot();
        mr1.status = "exploring";
        mr1.speed = 2;
        mr1.temperature = -80;
        mr1.checkTemperature();
        mr1.showAttributes();

        System.out.println("\n============\n");

        mr1.temperature = -81;
        mr1.checkTemperature();
        mr1.showAttributes();

        System.out.println("wishes: " + mr1.getWishes());
        mr1.addOneWish();
        System.out.println("wishes: " + mr1.getWishes());

    }


}
