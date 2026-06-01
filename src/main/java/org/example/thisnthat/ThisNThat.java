package org.example.thisnthat;

public class ThisNThat {
    int score = 0;
    String name;

    public void resetScore() {
        this.score = 0;
    }

    public int getScore() {
        System.out.println(score);
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ThisNThat setName(String name) {
        this.name = name;
        return this;
    }

    public void getInfo() {
        System.out.println("Name: " + this.name + "\nScore: " + this.score);
    }

    public void resetData(ThisNThat obj) {
       obj.score = 0;
    }
    public void resetMe(ThisNThat tnt) {
        resetData(this);
    }
}
