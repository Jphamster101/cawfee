package org.example.mathexample;
import java.lang.Math;
import java.util.Random;
import java.util.random.RandomGenerator;


public class Main {
    public static void main(String[] args) {
        System.out.println(Math.max(54, 31));

        for (int i = 0; i < 10; i++) {
            System.out.print(RandomGenerator.getDefault().nextInt(1, 10));
        }

    }
}
