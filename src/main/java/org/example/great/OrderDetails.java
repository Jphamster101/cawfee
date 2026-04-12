package org.example.great;

public class OrderDetails {
    public boolean putOnLayaway(int itemNumber, float price, int quantity) {
        return (price * quantity) > 1000;
    }
}
