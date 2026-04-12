package org.example;

import org.example.animal.Animal;
import org.example.animal.Corgi;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {
        Corgi kenji = new Corgi("Kenji", 2);
        kenji.getSound();
        kenji.getAction();
        System.out.println("As a " + kenji.getNumberOfLimbs());
    }
}
