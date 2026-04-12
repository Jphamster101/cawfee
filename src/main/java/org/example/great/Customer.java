package org.example.great;

public class Customer {
    public OrderDetails orderTotal;
    public CancelNotification cancelOrder() {
        return new CancelNotification();
    }
}
