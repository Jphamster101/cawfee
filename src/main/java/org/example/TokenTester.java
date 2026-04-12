package org.example;
import java.util.StringTokenizer;

public class TokenTester {
    public static void myTinkering() {
        String birthday = "05/22/1998";
        StringTokenizer parsedBirthday = new StringTokenizer(birthday, "/");

        System.out.println("Running myExample()...");
        while (parsedBirthday.hasMoreTokens()) {
            System.out.println(parsedBirthday.nextToken());
        }
    }

    public static void bookExample() {
        StringTokenizer str1, str2;
        String quote1 = "GOOG 530.80 -9.98";
        str1 = new StringTokenizer(quote1);

        System.out.println("Token 1: " + str1.nextToken());
        System.out.println("Token 2: " + str1.nextToken());
        System.out.println("Token 3: " + str1.nextToken());

        String quote2 = "RHT@75.00@0.22";
        str2 = new StringTokenizer(quote2, "@");


        System.out.println("\nToken 1: " + str2.nextToken());
        System.out.println("Token 2: " + str2.nextToken());
        System.out.println("Token 3: " + str2.nextToken());
    }

    public static void main(String[] args) {
        // myTinkering();
        bookExample();
    }
}
