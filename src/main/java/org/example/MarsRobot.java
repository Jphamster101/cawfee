package org.example;

public class MarsRobot {
    private static int wishes = 3;
    String status;
    int speed;
    float temperature;

    void checkTemperature() {
        if (temperature < -80) {
            status = "returning home";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("status: " + status);
        System.out.println("speed: " + speed);
        System.out.println("temperature: " + temperature);
    }

    void addOneWish() {
        MarsRobot.wishes += 1;
    }

    int getWishes() {
        System.out.println("Number of wishes: " + wishes);
        return wishes;
    }
}
