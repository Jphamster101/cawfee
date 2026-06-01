package org.example.thisnthat;

public class Main {
    public static void main(String[] args) {
        ThisNThat tnt = new ThisNThat();
        tnt.getScore();
        tnt.setName("Guy");
        tnt.setScore(10);
        tnt.getInfo();
        tnt.resetMe(tnt);
        tnt.getScore();
    }
}
