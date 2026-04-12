package org.example.exercises;

public class DivisionRemainderDisplay_2 {
    public static void divisionRemainderDisplay(int a, int b) {
        int quotient = a / b;
        int remainder = a % b;

        System.out.println(a + " / " + b);
        System.out.println("Quotient: " + quotient + "\t Remainder: " + remainder);
    }
    public static void main(String[] args) {
        DivisionRemainderDisplay_2.divisionRemainderDisplay(423, 78);
    }
}
